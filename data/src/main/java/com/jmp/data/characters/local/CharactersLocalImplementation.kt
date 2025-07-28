package com.jmp.data.characters.local

import com.jmp.common.model.Character
import com.jmp.common.model.types.Either
import com.jmp.common.model.types.Failure
import com.jmp.data.characters.local.model.CachedCharacterMapper
import com.jmp.data.characters.repository.source.CharactersLocalDataStore
import com.jmp.data.local.database.RickAndMortyDatabase

class CharactersLocalImplementation(
    private val database: RickAndMortyDatabase,
    private val mapper: CachedCharacterMapper
) : CharactersLocalDataStore {

    override suspend fun saveCharacters(characters: List<Character>) =
        database.characterDao().insertAll(
            characters.map { mapper.mapToCached(it) }
        )

    override suspend fun getCharacters(): Either<Failure, List<Character>> {
        val result = database.characterDao().getAll().map { mapper.mapFromCached(it) }

        return if (result.isNotEmpty()) Either.Success(result)
        else Either.Error(Failure.NoCharactersToDisplay)
    }

    override suspend fun clearCharacters() = database.characterDao().clear()
}
