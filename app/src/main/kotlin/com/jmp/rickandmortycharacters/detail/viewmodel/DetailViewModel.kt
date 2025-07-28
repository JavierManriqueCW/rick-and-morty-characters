package com.jmp.rickandmortycharacters.detail.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmp.common.model.types.Failure
import com.jmp.domain.characters.interactor.GetListState
import com.jmp.rickandmortycharacters.common.state.ResourceState
import com.jmp.rickandmortycharacters.detail.state.DetailUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

typealias CharacterDetailUiState = ResourceState<DetailUiState>

class DetailViewModel(
    private val getListState: GetListState
) : ViewModel() {

    private var _uiState: MutableStateFlow<CharacterDetailUiState> = MutableStateFlow(ResourceState.Loading())
    val uiState = _uiState

    fun loadData(characterId: Long) {
        viewModelScope.launch {
            getListState().collect { list ->
                list.find { it.id == characterId }?.let { character ->
                    updateUiState(
                        ResourceState.Success(
                            DetailUiState(character = character)
                        )
                    )
                } ?: run {
                    updateUiState(
                        ResourceState.Error(
                            Failure.CharacterNotFound
                        )
                    )
                }
            }
        }
    }

    private fun updateUiState(newState: CharacterDetailUiState) {
        _uiState.value = newState
    }
}
