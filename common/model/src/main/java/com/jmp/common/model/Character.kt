package com.jmp.common.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Character(
    val id: Long,
    val name: String,
    val status: Status,
    val gender: String,
    val species: String,
    val image: String,
    val origin: Origin,
    val location: Location
) : Parcelable