package com.jmp.domain.characters.interactor

import com.jmp.common.model.types.Either
import com.jmp.common.model.types.Failure
import com.jmp.domain.characters.repository.CharactersRepository

open class FetchList(
    private val charactersRepository: CharactersRepository
) {

    data class FetchListParams(val forceRemote: Boolean = true)

    suspend operator fun invoke(params: FetchListParams?): Either<Failure, Unit> {
        checkNotNull(params)
        return charactersRepository.fetchList(params.forceRemote)
    }
}
