package com.tulgot.ricknmorty.data.response

data class ResponseDto(
    val info: InfoDto,
    val results: List<ResultDto>
)