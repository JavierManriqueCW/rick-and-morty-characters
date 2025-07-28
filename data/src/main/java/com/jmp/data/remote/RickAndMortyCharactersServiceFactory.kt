package com.jmp.data.remote

import com.google.gson.Gson
import com.jmp.data.remote.RickAndMortyCharactersService.Companion.BASE_URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RickAndMortyCharactersServiceFactory {

    fun makeRickAndMortyCharactersServiceFactory(isDebug: Boolean, gson: Gson): RickAndMortyCharactersService {
        return makeRickAndMortyCharactersService(makeOkHttpClient(makeLoggingInterceptor(isDebug)), gson)
    }

    private fun makeRickAndMortyCharactersService(okHttpClient: OkHttpClient, gson: Gson): RickAndMortyCharactersService {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()

        return retrofit.create(RickAndMortyCharactersService::class.java)
    }

    private fun makeOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .build()
    }

    private fun makeLoggingInterceptor(isDebug: Boolean): HttpLoggingInterceptor {
        val logging = HttpLoggingInterceptor()
        logging.level = if (isDebug)
            HttpLoggingInterceptor.Level.BODY
        else
            HttpLoggingInterceptor.Level.NONE
        return logging
    }
}