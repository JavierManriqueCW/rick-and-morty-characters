package com.jmp.rickandmortycharacters.list.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmp.domain.characters.interactor.FetchList
import com.jmp.domain.characters.interactor.GetListState
import com.jmp.rickandmortycharacters.common.state.ResourceState
import com.jmp.rickandmortycharacters.list.state.ListUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

typealias CharactersState = ResourceState<ListUiState>

class ListViewModel(
    private val getListState: GetListState,
    private val fetchList: FetchList
) : ViewModel() {

    private var _uiState: MutableStateFlow<CharactersState> = MutableStateFlow(ResourceState.Loading())
    val uiState: StateFlow<CharactersState> = _uiState

    init {
        viewModelScope.launch {
            getListState().collect { list ->
                updateUiState(
                    ResourceState.Success(ListUiState(list, list))
                )
            }
        }
    }

    private fun updateUiState(newState: CharactersState) {
        _uiState.value = newState
    }

    fun reload() {
        viewModelScope.launch {
            fetchList(FetchList.FetchListParams(forceRemote = true))
        }
    }
}
