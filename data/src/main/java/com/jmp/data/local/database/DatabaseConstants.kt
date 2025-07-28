package com.jmp.data.local.database

object DatabaseConstants {
    const val CHARACTERS_TABLE = "characters"
    const val GET_CHARACTERS = "SELECT* FROM $CHARACTERS_TABLE"
    const val CLEAR_CHARACTERS = "DELETE FROM $CHARACTERS_TABLE"
}