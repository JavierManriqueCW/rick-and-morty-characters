package com.jmp.data.remote

import com.jmp.data.remote.model.CharacterWrapperResponse
import retrofit2.http.GET

interface RickAndMortyCharactersService {

    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/"
        private const val CHARACTERS_PATH = "api/character"
    }

    @GET(CHARACTERS_PATH)
    suspend fun getCharacters(): CharacterWrapperResponse
}