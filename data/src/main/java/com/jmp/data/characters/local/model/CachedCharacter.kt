package com.jmp.data.characters.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.jmp.data.local.database.DatabaseConstants

@Entity(tableName = DatabaseConstants.CHARACTERS_TABLE)
data class CachedCharacter(
    @PrimaryKey
    val id: Long,
    val name: String,
    val status: String,
    val gender: String,
    val species: String,
    val image: String,
    val origin: CachedOrigin,
    val location: CachedLocation
)
