package com.tulgot.ricknmorty.di

import com.tulgot.ricknmorty.data.RicknMortyRepositoryImp
import com.tulgot.ricknmorty.domain.RicknMortyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRicknMortyRepository( RicknMortyRepositoryImp: RicknMortyRepositoryImp): RicknMortyRepository
}