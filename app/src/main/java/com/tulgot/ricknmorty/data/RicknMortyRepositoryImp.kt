package com.tulgot.ricknmorty.data

import android.util.Log
import com.tulgot.ricknmorty.data.response.ResponseDto
import com.tulgot.ricknmorty.domain.RicknMortyRepository
import com.tulgot.ricknmorty.domain.model.Response
import com.tulgot.ricknmorty.domain.model.Result
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.withContext
import javax.inject.Inject



class RicknMortyRepositoryImp @Inject constructor (
    val ricknmortyapi : RicknMortyApi
) : RicknMortyRepository{

     /*suspend fun getCharacterList() : Flow<Response> {
         return flow {
             ricknmortyapi.getCharacters().toResponse()
         }
     }

    suspend fun getCharacterList():Response{
        return ricknmortyapi.getCharacters().toResponse()  remoteWordResultDto
    }*/

    override suspend fun getCharacterList(): Response{

        var characterlist = ricknmortyapi.getCharacters().toResponse()
        return characterlist
    }

}

