package com.tulgot.ricknmorty.data

import com.tulgot.ricknmorty.domain.model.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class RicknMortyRepositoryImp @Inject constructor (private val ricknmortyapi : RicknMortyApi){

     suspend fun getCharacterList() : Response {
         return ricknmortyapi.getCharacters().toResponse()
    }

//    fun getCharacterList(): RicknMortyApi {
//        val retrofitresult = ApiModule.provideApiService().create(RicknMortyApi::class.java)
//        return retrofitresult
//
//    }

}

