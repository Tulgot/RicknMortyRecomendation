package com.tulgot.ricknmorty.data

import com.tulgot.ricknmorty.domain.RicknMortyRepository
import com.tulgot.ricknmorty.domain.model.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class RicknMortyRepositoryImp @Inject constructor (
    val ricknmortyapi : RicknMortyApi
) : RicknMortyRepository{

//    override suspend fun getCharacterList(): Response{
//
//        var characterlist = ricknmortyapi.getCharacters().toResponse()
//        return characterlist
//    }

    override suspend fun getCharacterList(): Flow<Response> {
        return flow{
            emit(ricknmortyapi.getCharacters().toResponse())
        }
    }

}

