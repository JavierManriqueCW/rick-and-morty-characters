package com.jmp.rickandmortycharacters.list.state

import com.jmp.common.model.Character

data class ListUiState(
    val rawList: List<Character>,
    val filteredList: List<Character>
)
