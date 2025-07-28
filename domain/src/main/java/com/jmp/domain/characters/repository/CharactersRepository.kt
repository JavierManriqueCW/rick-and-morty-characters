package com.jmp.domain.characters.repository

import com.jmp.common.model.Character
import com.jmp.common.model.types.Either
import com.jmp.common.model.types.Failure
import kotlinx.coroutines.flow.StateFlow

interface CharactersRepository {
    suspend fun fetchList(forceRemote: Boolean): Either<Failure, Unit>
    suspend fun getListState(): StateFlow<List<Character>>
}
