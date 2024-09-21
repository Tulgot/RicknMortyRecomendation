package com.tulgot.ricknmorty.domain

import com.tulgot.ricknmorty.domain.model.Response
import kotlinx.coroutines.flow.Flow

interface CharacterListRepository {
    suspend fun getCharacterList():Flow<Response>
}