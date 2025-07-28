package com.jmp.data.characters.repository.source

import com.jmp.common.model.Character
import com.jmp.common.model.types.Either
import com.jmp.common.model.types.Failure

interface CharactersDataStore {
    suspend fun getCharacters(): Either<Failure, List<Character>>
}
