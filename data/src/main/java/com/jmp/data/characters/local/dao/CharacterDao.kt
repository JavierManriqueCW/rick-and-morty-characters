package com.jmp.data.characters.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.jmp.data.characters.local.model.CachedCharacter
import com.jmp.data.local.database.DatabaseConstants

@Dao
interface CharacterDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(characters: List<CachedCharacter>)

    @Query(DatabaseConstants.GET_CHARACTERS)
    suspend fun getAll(): List<CachedCharacter>

    @Query(DatabaseConstants.CLEAR_CHARACTERS)
    suspend fun clear()
}