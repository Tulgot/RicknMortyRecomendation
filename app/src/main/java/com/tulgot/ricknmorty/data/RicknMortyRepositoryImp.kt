package com.tulgot.ricknmorty.data

import com.tulgot.ricknmorty.domain.RicknMortyRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RicknMortyRepositoryImp @Inject constructor(
    private val rickNMortyApi: RicknMortyApi
) : RicknMortyRepository {

    override suspend fun getCharacterList() = flow {
        emit(rickNMortyApi.getCharacters().toResponse())
    }
}