package com.tulgot.ricknmorty.domain

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {

    protected fun executeFlow(block: suspend () -> Unit) = viewModelScope.launch {
        try {
            block.invoke()
        } catch (e: Exception) {
            e.stackTraceToString().log("ERROR_VMODEL")
        }
    }
}

fun String.log(key: String) {
    Log.e(key, this)
}