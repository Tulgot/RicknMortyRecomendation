package com.tulgot.ricknmorty.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tulgot.ricknmorty.domain.RicknMortyRepository
import com.tulgot.ricknmorty.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import javax.inject.Inject
import com.tulgot.ricknmorty.presentation.MainState
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModel @Inject constructor(val api: RicknMortyRepository) :
    ViewModel() {

//        private var _characterlist = MutableStateFlow<Response?>(null)
//        val characterlist = _characterlist.asStateFlow()
//
//        fun fetchcharactelist(){
//            viewModelScope.launch {
//            _characterlist.update {api.getCharacterList()}
//            }
//        }



    private var _characterlist = MutableStateFlow(MainState())
    val characterlist = _characterlist.asStateFlow()

    init {
        viewModelScope.launch{
            loadCharacterList()
        }
    }

    fun loadCharacterList(){
        viewModelScope.launch {
            api.getCharacterList().collect(){Response ->
                _characterlist.update {
                    it.copy(characterList = Response)
                }
            }
        }
    }



}