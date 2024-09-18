package com.tulgot.ricknmorty.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tulgot.ricknmorty.data.RicknMortyRepositoryImp
import com.tulgot.ricknmorty.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.util.concurrent.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val ricknMortyRepositoryImp: RicknMortyRepositoryImp) :
    ViewModel() {

//        private fun getcharacterlist(){
//            viewModelScope.launch{
//                ricknMortyRepositoryImp.getCharacterList().collect()
//            }
//        }

//        suspend fun getcharacterlist(): Response{
//            return ricknMortyRepositoryImp.getCharacterList()
//    }
        val characterList = viewModelScope.launch {
    ricknMortyRepositoryImp.getCharacterList()
    }
}