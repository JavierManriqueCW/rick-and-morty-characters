package com.jmp.domain.characters.interactor

import com.jmp.common.model.Character
import com.jmp.domain.characters.repository.CharactersRepository
import kotlinx.coroutines.flow.StateFlow

open class GetListState(
    private val charactersRepository: CharactersRepository
) {

    suspend operator fun invoke(): StateFlow<List<Character>> {
        return charactersRepository.getListState()
    }
}
