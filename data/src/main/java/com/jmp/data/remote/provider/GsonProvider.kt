package com.jmp.data.remote.provider

import com.google.gson.FieldNamingPolicy
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.Strictness
import com.jmp.data.remote.serializer.DateDeserializer
import java.util.Date

object GsonProvider {

    fun makeGson(): Gson {
        val dateDeserializer = DateDeserializer()
        dateDeserializer.addDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        dateDeserializer.addDateFormat("yyyy/MM/dd")
        dateDeserializer.addDateFormat("yyyy-MM-dd")
        return GsonBuilder()
            .setStrictness(Strictness.LENIENT)
            .registerTypeAdapter(Date::class.java, dateDeserializer)
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create()
    }
}