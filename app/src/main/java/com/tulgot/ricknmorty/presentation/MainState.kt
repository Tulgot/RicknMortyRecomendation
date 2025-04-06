package com.tulgot.ricknmorty.presentation

import com.tulgot.ricknmorty.domain.model.Response
import com.tulgot.ricknmorty.domain.network.UiStates

data class MainState(
    val state: UiStates = UiStates.NONE,
    val characterList: Response? = null
)
