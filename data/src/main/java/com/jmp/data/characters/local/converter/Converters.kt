package com.jmp.data.characters.local.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.jmp.data.characters.local.model.CachedLocation
import com.jmp.data.characters.local.model.CachedOrigin

class Converters {

    private val gson = Gson()

    @TypeConverter
    fun fromOrigin(origin: CachedOrigin?): String? {
        return origin?.let { gson.toJson(it) }
    }

    @TypeConverter
    fun toOrigin(originJson: String?): CachedOrigin? {
        if (originJson.isNullOrEmpty()) return null
        val type = object : TypeToken<CachedOrigin>() {}.type
        return gson.fromJson(originJson, type)
    }

    @TypeConverter
    fun fromLocation(location: CachedLocation?): String? {
        return location?.let { gson.toJson(it) }
    }

    @TypeConverter
    fun toLocation(locationJson: String?): CachedLocation? {
        if (locationJson.isNullOrEmpty()) return null
        val type = object : TypeToken<CachedLocation>() {}.type
        return gson.fromJson(locationJson, type)
    }
}
