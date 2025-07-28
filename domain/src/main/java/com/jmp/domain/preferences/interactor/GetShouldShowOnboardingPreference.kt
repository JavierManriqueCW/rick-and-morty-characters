package com.jmp.domain.preferences.interactor

import com.jmp.domain.preferences.repository.PreferencesRepository

class GetShouldShowOnboardingPreference(private val preferencesRepository: PreferencesRepository) {

    operator fun invoke(): Boolean = preferencesRepository.shouldShowOnboarding()
}
