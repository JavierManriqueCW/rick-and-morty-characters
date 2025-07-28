package com.jmp.data.di

import android.content.Context
import android.content.SharedPreferences
import com.jmp.common.diprovider.DependencyInjectorModules
import com.jmp.data.BuildConfig
import com.jmp.data.characters.local.CharactersLocalImplementation
import com.jmp.data.characters.local.model.CachedCharacterMapper
import com.jmp.data.characters.remote.CharactersRemoteImplementation
import com.jmp.data.characters.remote.CharactersRemoteMapper
import com.jmp.data.characters.repository.CharactersDataRepository
import com.jmp.data.characters.repository.source.CharactersLocalDataStore
import com.jmp.data.characters.repository.source.CharactersRemoteDataStore
import com.jmp.data.local.cache.CacheMemory
import com.jmp.data.local.database.RickAndMortyDatabase
import com.jmp.data.local.preferences.SharedPreferencesDataSource
import com.jmp.data.local.preferences.SharedPreferencesManager
import com.jmp.data.preferences.repository.PreferencesDataRepository
import com.jmp.data.preferences.source.PreferencesDataStore
import com.jmp.data.remote.NetworkHandler
import com.jmp.data.remote.RickAndMortyCharactersServiceFactory
import com.jmp.data.remote.provider.GsonProvider
import com.jmp.domain.characters.repository.CharactersRepository
import com.jmp.domain.preferences.repository.PreferencesRepository
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

object DataDependencies : DependencyInjectorModules {

    override val modules: List<Module>
        get() =
            listOf(
                getCharactersModule(),
                getPreferencesModule(),
                getServiceModule(),
                getDatabaseModule()
        )

    private fun getCharactersModule(): Module =
        module {
            singleOf(::CacheMemory)
            factoryOf(::CharactersRemoteMapper)
            factoryOf(::CachedCharacterMapper)
            factoryOf(::CharactersRemoteImplementation) { bind<CharactersRemoteDataStore>() }
            factoryOf(::CharactersLocalImplementation) { bind<CharactersLocalDataStore>() }
            factoryOf(::CharactersDataRepository) { bind<CharactersRepository>() }
        }

    private fun getPreferencesModule(): Module =
        module {
            single<SharedPreferences> { androidContext().getSharedPreferences("prefs", Context.MODE_PRIVATE) }
            factoryOf(::SharedPreferencesManager)
            factoryOf(::SharedPreferencesDataSource) { bind<PreferencesDataStore>() }
            factoryOf(::PreferencesDataRepository) { bind<PreferencesRepository>() }
        }

    private fun getServiceModule(): Module =
        module {
            singleOf(::NetworkHandler)
            single { GsonProvider.makeGson() }
            factory {
                RickAndMortyCharactersServiceFactory.makeRickAndMortyCharactersServiceFactory(
                    BuildConfig.DEBUG,
                    get()
                )
            }
        }

    private fun getDatabaseModule(): Module =
        module {
            single { RickAndMortyDatabase.getInstance(androidContext()) }
            factory { get<RickAndMortyDatabase>().characterDao() }
        }
}
