package com.jmp.data.characters.remote

import com.jmp.common.model.Character
import com.jmp.common.model.types.Either
import com.jmp.common.model.types.Failure
import com.jmp.data.characters.repository.source.CharactersRemoteDataStore
import com.jmp.data.remote.NetworkHandler
import com.jmp.data.remote.RickAndMortyCharactersService

class CharactersRemoteImplementation(
    private val service: RickAndMortyCharactersService,
    private var mapper: CharactersRemoteMapper,
    private val networkHandler: NetworkHandler
) : CharactersRemoteDataStore {

    override suspend fun getCharacters(): Either<Failure, List<Character>> =
        Either.request(networkHandler.isConnected()) {
            mapper.mapFromRemote(service.getCharacters())
        }
}
