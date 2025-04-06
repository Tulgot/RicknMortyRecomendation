package com.tulgot.ricknmorty.presentation

import android.util.Log
import androidx.lifecycle.viewModelScope
import com.tulgot.ricknmorty.domain.BaseViewModel
import com.tulgot.ricknmorty.domain.RicknMortyRepository
import com.tulgot.ricknmorty.domain.network.UiStates
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val rickNMortyRepository: RicknMortyRepository) : BaseViewModel() {


    private var _characterList = MutableStateFlow(MainState())

    val characterList = _characterList.asStateFlow()

    init {
        loadCharacterList()
    }

    private fun loadCharacterList() {
        executeFlow {
            _characterList.update {
                it.copy(
                    state = UiStates.LOADING
                )
            }
            rickNMortyRepository.getCharacterList()
                .catch { cause ->
                    Log.e(this::class.simpleName, cause.toString())
                    _characterList.update {
                        it.copy(
                            characterList = null,
                            state = UiStates.FAILURE
                        )
                    }
                }
                .collect { response ->
                    _characterList.update {
                        it.copy(
                            characterList = response,
                            state = UiStates.SUCCESS
                        )
                    }
                }
        }
    }
}