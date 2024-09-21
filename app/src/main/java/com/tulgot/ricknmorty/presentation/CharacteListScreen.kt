package com.tulgot.ricknmorty.presentation

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tulgot.ricknmorty.data.RicknMortyApi
import com.tulgot.ricknmorty.data.RicknMortyRepositoryImp
import com.tulgot.ricknmorty.di.ApiModule
import com.tulgot.ricknmorty.domain.model.Response
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@Composable
fun CharacterListScreen( mainViewModel: MainViewModel = hiltViewModel() ){


//    val characterlist = GlobalScope.launch{
//        mainviewmodel.getcharacterlist()
//    }
//

//    val mainViewModel = hiltViewModel<MainViewModel>()
//
//    Log.d("trafalgar: ", mainViewModel.toString())

    val characterlist = mainViewModel
    Text(text = characterlist.toString())



}