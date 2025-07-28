package com.jmp.data.remote.model

import com.google.gson.annotations.SerializedName

data class CharacterWrapperResponse(
    @SerializedName("results")
    var results: List<CharacterResponse>
)