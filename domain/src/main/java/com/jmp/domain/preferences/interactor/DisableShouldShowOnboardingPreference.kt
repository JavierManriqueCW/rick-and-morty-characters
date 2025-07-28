package com.jmp.domain.preferences.interactor

import com.jmp.domain.preferences.repository.PreferencesRepository

class DisableShouldShowOnboardingPreference(private val preferencesRepository: PreferencesRepository) {

    operator fun invoke(shouldShow: Boolean) {
        return preferencesRepository.saveShouldShowOnboarding(shouldShow)
    }
}