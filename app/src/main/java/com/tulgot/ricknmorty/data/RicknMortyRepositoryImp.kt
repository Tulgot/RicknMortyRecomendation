package com.tulgot.ricknmorty.data

import com.tulgot.ricknmorty.domain.CharacterListRepository
import com.tulgot.ricknmorty.domain.model.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import javax.inject.Inject


class RicknMortyRepositoryImp @Inject constructor (private val ricknmortyapi : RicknMortyApi) : CharacterListRepository{

//     suspend fun getCharacterList() : Flow<Response> {
//         return flow {
//             ricknmortyapi.getCharacters().toResponse()
//         }
//     }

//    suspend fun getCharacterList():Response{
//        return ricknmortyapi.getCharacters().toResponse()  remoteWordResultDto
//    }

    override suspend fun getCharacterList(): Flow<Response> {
        return flow {
                ricknmortyapi.getCharacters().toResponse()
        }
    }
}

