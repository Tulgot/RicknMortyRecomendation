package com.tulgot.ricknmorty.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tulgot.ricknmorty.data.RicknMortyRepositoryImp
import com.tulgot.ricknmorty.domain.CharacterListRepository
import com.tulgot.ricknmorty.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.concurrent.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(characterListRepository: CharacterListRepository) :
    ViewModel() {

//        private fun getcharacterlist(){
//            viewModelScope.launch{
//                ricknMortyRepositoryImp.getCharacterList()
//            }
//        }

//        suspend fun getcharacterlist(): Response{
//            return ricknMortyRepositoryImp.getCharacterList()
//    }

        private var searchJob: Job? = null
    init {
        searchJob = viewModelScope.launch {
            characterListRepository.getCharacterList().collect()
        }
    }

//        val characterlist =  characterListRepository.getCharacterList()


}