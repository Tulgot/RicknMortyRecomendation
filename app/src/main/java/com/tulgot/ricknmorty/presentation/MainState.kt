package com.tulgot.ricknmorty.presentation

import com.tulgot.ricknmorty.domain.model.Response
import com.tulgot.ricknmorty.domain.network.UiStates
import com.tulgot.ricknmorty.domain.network.UiStates2

data class MainState(
    val state: UiStates2 = UiStates2.NONE,
    val characterList: Response? = null
)
