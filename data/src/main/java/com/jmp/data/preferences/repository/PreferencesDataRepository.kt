package com.jmp.data.preferences.repository

import com.jmp.data.preferences.source.PreferencesDataStore
import com.jmp.domain.preferences.repository.PreferencesRepository

class PreferencesDataRepository(private val preferencesDataStore: PreferencesDataStore):
    PreferencesRepository {

    override fun saveShouldShowOnboarding(shouldShow: Boolean) = preferencesDataStore.saveShouldShowOnboarding(shouldShow)

    override fun shouldShowOnboarding(): Boolean = preferencesDataStore.shouldShowOnboarding()
}