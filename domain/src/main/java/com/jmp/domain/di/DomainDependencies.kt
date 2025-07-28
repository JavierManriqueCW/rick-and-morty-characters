package com.jmp.domain.di

import com.jmp.common.diprovider.DependencyInjectorModules
import com.jmp.domain.characters.interactor.FetchList
import com.jmp.domain.characters.interactor.GetListState
import com.jmp.domain.preferences.interactor.DisableShouldShowOnboardingPreference
import com.jmp.domain.preferences.interactor.GetShouldShowOnboardingPreference
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

object DomainDependencies : DependencyInjectorModules {
    override val modules: List<Module>
        get() = listOf(
            module {
                factoryOf(::FetchList)
                factoryOf(::GetListState)
                factoryOf(::DisableShouldShowOnboardingPreference)
                factoryOf(::GetShouldShowOnboardingPreference)
            }
        )
}
