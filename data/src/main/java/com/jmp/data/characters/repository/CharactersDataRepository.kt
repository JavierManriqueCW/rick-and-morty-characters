package com.jmp.data.characters.repository

import com.jmp.common.model.Character
import com.jmp.common.model.types.Either
import com.jmp.common.model.types.Failure
import com.jmp.common.model.types.getOrNull
import com.jmp.data.characters.repository.source.CharactersLocalDataStore
import com.jmp.data.characters.repository.source.CharactersRemoteDataStore
import com.jmp.data.local.cache.CacheMemory
import com.jmp.domain.characters.repository.CharactersRepository
import kotlinx.coroutines.flow.StateFlow

class CharactersDataRepository(
    private val remoteCharactersRepository: CharactersRemoteDataStore,
    private val localCharactersDataStore: CharactersLocalDataStore,
    private val cacheMemory: CacheMemory
) : CharactersRepository {

    override suspend fun fetchList(forceRemote: Boolean): Either<Failure, Unit> =
        if (forceRemote) {
            // Data is obtained from remote straight away
            // if something goes off, we try to obtain it from the database
            when (val remoteResult = getListFromRemote()) {
                is Either.Success -> {
                    updateCacheMemory(remoteResult.data)
                    Either.Success(Unit)
                }
                is Either.Error -> {
                    when (val localResult = getListFromDatabase()) {
                        is Either.Success -> {
                            updateCacheMemory(localResult.data)
                            Either.Success(Unit)
                        }
                        is Either.Error -> {
                            Either.Error(remoteResult.failure)
                        }
                    }
                }
            }
        } else {
            // We try to obtain data from the database first
            // if there is no data to obtain, we try to obtain it from the remote
            when (val localResult = getListFromDatabase()) {
                is Either.Success -> {
                    updateCacheMemory(localResult.data)
                    Either.Success(Unit)
                }
                is Either.Error -> {
                    when (val remoteData = getListFromRemote()) {
                        is Either.Success -> {
                            updateCacheMemory(remoteData.data)
                            Either.Success(Unit)
                        }
                        is Either.Error -> { remoteData }
                    }
                }
            }
        }

    override suspend fun getListState(): StateFlow<List<Character>> =
        cacheMemory.getListState()

    private suspend fun getListFromRemote(): Either<Failure, List<Character>> =
        remoteCharactersRepository
            .getCharacters()
            .getOrNull()
            ?.let {
                localCharactersDataStore.clearCharacters()
                localCharactersDataStore.saveCharacters(it)
                Either.Success(it)
            } ?: run {
                Either.Error(Failure.NoCharactersToDisplay)
            }

    private suspend fun getListFromDatabase(): Either<Failure, List<Character>> =
        localCharactersDataStore.getCharacters()

    private fun updateCacheMemory(characters: List<Character>) =
        cacheMemory.saveListState(characters)
}
