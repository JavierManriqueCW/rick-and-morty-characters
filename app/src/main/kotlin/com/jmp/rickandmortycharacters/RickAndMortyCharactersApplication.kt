package com.jmp.rickandmortycharacters

import android.app.Application
import com.jmp.rickandmortycharacters.common.di.KoinDependencies
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

open class RickAndMortyCharactersApplication : Application() {

    override fun onCreate() {
        startKoin {
            androidContext(this@RickAndMortyCharactersApplication)
            modules(KoinDependencies.modules)
        }
        super.onCreate()
    }
}