package com.jmp.data.preferences.source

interface PreferencesDataStore {

    fun shouldShowOnboarding(): Boolean

    fun saveShouldShowOnboarding(shouldShow: Boolean)
}