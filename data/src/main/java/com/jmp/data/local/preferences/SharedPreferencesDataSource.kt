package com.jmp.data.local.preferences

import com.jmp.data.preferences.source.PreferencesDataStore

open class SharedPreferencesDataSource(private val manager: SharedPreferencesManager): PreferencesDataStore {

    override fun shouldShowOnboarding(): Boolean =
        manager.getBoolean(
            PREF_SHOULD_SHOW_ONBOARDING,
            true
        )

    override fun saveShouldShowOnboarding(shouldShow: Boolean) {
        manager.setPreferenceBoolean(
            PREF_SHOULD_SHOW_ONBOARDING,
            shouldShow
        )
    }

    private companion object {
        const val PREF_SHOULD_SHOW_ONBOARDING = "should_show_onboarding"
    }
}