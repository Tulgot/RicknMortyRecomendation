package com.tulgot.ricknmorty.di

import com.tulgot.ricknmorty.data.RicknMortyApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

        private const val BASE_URL = "https://rickandmortyapi.com"

        @Provides
        @Singleton
        fun provideApiService(): RicknMortyApi{
            return Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RicknMortyApi::class.java)
        }

}