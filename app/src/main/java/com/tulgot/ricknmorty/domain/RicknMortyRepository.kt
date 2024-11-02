package com.tulgot.ricknmorty.domain

import com.tulgot.ricknmorty.domain.model.Response
import kotlinx.coroutines.flow.Flow

interface RicknMortyRepository {
    suspend fun getCharacterList(): Response
}