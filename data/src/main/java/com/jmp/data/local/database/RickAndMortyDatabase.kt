package com.jmp.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.jmp.data.characters.local.converter.Converters
import com.jmp.data.characters.local.dao.CharacterDao
import com.jmp.data.characters.local.model.CachedCharacter

@Database(entities = [CachedCharacter::class], version = 1)
@TypeConverters(Converters::class)
abstract class RickAndMortyDatabase : RoomDatabase() {

    companion object {

        @Volatile
        private var instance: RickAndMortyDatabase? = null

        fun getInstance(context: Context): RickAndMortyDatabase {
            return instance ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RickAndMortyDatabase::class.java,
                    "rym.db"
                ).build()
                this.instance = instance
                instance
            }
        }
    }

    abstract fun characterDao(): CharacterDao
}
