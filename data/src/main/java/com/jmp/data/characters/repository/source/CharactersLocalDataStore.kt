package com.jmp.data.characters.repository.source

import com.jmp.common.model.Character

interface CharactersLocalDataStore: CharactersDataStore {

    suspend fun saveCharacters(characters: List<Character>)
    suspend fun clearCharacters()
}
