package com.jmp.data.remote.model

import com.google.gson.annotations.SerializedName

data class CharacterResponse(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("species")
    val species: String,
    @SerializedName("origin")
    val origin: OriginResponse,
    @SerializedName("location")
    val location: LocationResponse,
    @SerializedName("image")
    val image: String
)
