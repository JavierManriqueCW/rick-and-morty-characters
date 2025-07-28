package com.jmp.data.local.preferences

import android.content.SharedPreferences

open class SharedPreferencesManager(private val sharedPreferences: SharedPreferences) {

    open fun setPreferenceBoolean(key: String, value: Boolean) {
        val editor: SharedPreferences.Editor = sharedPreferences.edit()
        editor.putBoolean(key, value)
        editor.apply()
    }

    open fun getBoolean(key: String, defaultValue: Boolean): Boolean {
        return sharedPreferences.getBoolean(key, defaultValue)
    }
}