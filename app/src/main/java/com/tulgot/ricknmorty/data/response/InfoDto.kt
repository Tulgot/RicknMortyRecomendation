package com.tulgot.ricknmorty.data.response

data class InfoDto(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)