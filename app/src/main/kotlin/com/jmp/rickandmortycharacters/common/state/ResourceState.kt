package com.jmp.rickandmortycharacters.common.state

import com.jmp.common.model.types.Failure

sealed class ResourceState<out T>  {
    data class Success<T>(val data: T) : ResourceState<T>()
    class Loading<T> : ResourceState<T>()
    class Error<T>(val error: Failure) : ResourceState<T>()
}