package com.tulgot.ricknmorty.domain.network

import com.tulgot.ricknmorty.domain.EMPTY_STATE

sealed class UiStates(val message: String) {
    data object SUCCESS : UiStates(message = "SUCCESS")
    data object FAILURE : UiStates(message = "FAILURE")
    data object LOADING : UiStates(message = "LOADING")
    data object NONE : UiStates(message = EMPTY_STATE)
}

enum class UiStates2(val message: String) {
    SUCCESS("SUCCESS"), LOADING("LOADING"), FAILURE("FAILURE"), NONE(EMPTY_STATE)
}