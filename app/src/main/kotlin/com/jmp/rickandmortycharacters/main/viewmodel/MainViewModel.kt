package com.jmp.rickandmortycharacters.main.viewmodel

import androidx.lifecycle.ViewModel
import com.jmp.domain.preferences.interactor.DisableShouldShowOnboardingPreference
import com.jmp.domain.preferences.interactor.GetShouldShowOnboardingPreference
import com.jmp.rickandmortycharacters.common.navigation.Screen

class MainViewModel(
    private val disableShouldShowOnboardingPreference: DisableShouldShowOnboardingPreference,
    private val getShouldShowOnboardingPreference: GetShouldShowOnboardingPreference
) : ViewModel() {

    fun getStartDestinationScreen() =
        if (getShouldShowOnboardingPreference()) Screen.Onboarding.route
        else Screen.Characters.route

    fun disableShouldShowOnboarding() =
        disableShouldShowOnboardingPreference(false)
}
