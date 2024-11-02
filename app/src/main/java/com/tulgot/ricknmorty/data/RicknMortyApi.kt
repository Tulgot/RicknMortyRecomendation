package com.tulgot.ricknmorty.data

import com.tulgot.ricknmorty.data.response.ResponseDto
import retrofit2.http.GET

interface RicknMortyApi {
    @GET("/api/character/")
    suspend fun getCharacters(): ResponseDto
}