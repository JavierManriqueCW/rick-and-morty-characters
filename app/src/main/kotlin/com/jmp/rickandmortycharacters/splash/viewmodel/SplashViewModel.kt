package com.jmp.rickandmortycharacters.splash.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jmp.common.model.types.doOnFinish
import com.jmp.domain.characters.interactor.FetchList
import kotlinx.coroutines.launch

class SplashViewModel(
    private val fetchList: FetchList
) : ViewModel() {

    fun loadList(
        forceRemote: Boolean = true,
        onResult: () -> Unit
    ) {
        viewModelScope.launch {
            fetchList(FetchList.FetchListParams(forceRemote))
                .doOnFinish { onResult() }
        }
    }
}
