package com.jmp.domain.preferences.repository

interface PreferencesRepository {

    fun shouldShowOnboarding(): Boolean

    fun saveShouldShowOnboarding(shouldShow: Boolean)
}