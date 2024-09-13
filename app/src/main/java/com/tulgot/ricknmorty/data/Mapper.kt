package com.tulgot.ricknmorty.data

import com.tulgot.ricknmorty.data.response.ResponseDto
import com.tulgot.ricknmorty.data.response.ResultDto
import com.tulgot.ricknmorty.domain.model.Response
import com.tulgot.ricknmorty.domain.model.Result

fun ResponseDto.toResponse() = Response(
    results = results.map {
        it.toResult()
    }
)

fun ResultDto.toResult() = Result(
    name = name,
    episode = episode,
    created = created,
    gender = gender,
    id = id,
    image = image,
    species = species,
    status = status,
    type = type,
    url = url
)