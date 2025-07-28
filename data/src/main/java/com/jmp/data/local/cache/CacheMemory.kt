package com.jmp.data.local.cache

import com.jmp.common.model.Character
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CacheMemory {

    private var listState: MutableStateFlow<List<Character>> = MutableStateFlow(listOf())

    fun saveListState(characters: List<Character>) {
        listState.value = characters
    }

    fun getListState(): StateFlow<List<Character>> = listState
}
