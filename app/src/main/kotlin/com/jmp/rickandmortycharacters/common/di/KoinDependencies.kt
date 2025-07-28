package com.jmp.rickandmortycharacters.common.di

import com.jmp.common.di.core.CoreDependencies
import com.jmp.rickandmortycharacters.detail.viewmodel.DetailViewModel
import com.jmp.rickandmortycharacters.list.viewmodel.ListViewModel
import com.jmp.rickandmortycharacters.main.viewmodel.MainViewModel
import com.jmp.rickandmortycharacters.splash.viewmodel.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.dsl.module

object KoinDependencies {
    val modules: List<Module>
        get() = listOf(
            CoreDependencies.modules,
            listOf(
                module { viewModelOf(::SplashViewModel) },
                module { viewModelOf(::MainViewModel) },
                module { viewModelOf(::ListViewModel) },
                module { viewModelOf(::DetailViewModel) }
            )
        ).flatten()
}
