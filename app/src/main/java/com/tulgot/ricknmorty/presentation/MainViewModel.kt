package com.tulgot.ricknmorty.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tulgot.ricknmorty.data.RicknMortyRepositoryImp
import com.tulgot.ricknmorty.domain.RicknMortyRepository
import com.tulgot.ricknmorty.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(val api: RicknMortyRepository) :
    ViewModel() {

    /*private fun getcharacterlist(){
            viewModelScope.launch{
                ricknMortyRepositoryImp.getCharacterList()
            }
        }

        suspend fun getcharacterlist(): Response{
            return ricknMortyRepositoryImp.getCharacterList()
    }

        private var searchJob: Job? = null
    init {
        searchJob = viewModelScope.launch {
            characterListRepository.getCharacterList().collect()
        }
    }

        val characterlist =  characterListRepository.getCharacterList()

    private fun loadcharacterlist(){
            viewModelScope.launch {
                ricknMortyRepositoryImp.getCharacterList().collect()
            }
        }



    var _characterlist = MutableStateFlow<Response?>(null)
    val characterlist = _characterlist.asStateFlow()
    fun getcharacterlist(){
        viewModelScope.launch {
            _characterlist.update { api.getCharacterList().collect() }
        }
    }*/

        private var _characterlist = MutableStateFlow<Response?>(null)
        val characterlist = _characterlist.asStateFlow()

        fun fetchcharactelist(){
            viewModelScope.launch {
            _characterlist.update {api.getCharacterList()}
            }
        }

}