package com.tulgot.ricknmorty.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.tulgot.ricknmorty.presentation.MainState

@Composable
fun CharacterListScreen (){
// fun CharacterListScreen (MainViewModel: MainViewModel = hiltViewModel()){
//    LaunchedEffect(key1 = true){
//        MainViewModel.fetchcharactelist()
//    }
//
//
//    val characters by MainViewModel.characterlist.collectAsState()
// }


    val mainViewModel = hiltViewModel<MainViewModel>()
    val mainstate by mainViewModel.characterlist.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = mainstate.characterList.toString() )
    }
}