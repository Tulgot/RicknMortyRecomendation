package com.tulgot.ricknmorty.presentation

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.tulgot.ricknmorty.domain.network.UiStates
import com.tulgot.ricknmorty.domain.network.UiStates2

@Preview(showBackground = true)
@Composable
fun CharacterListScreen(
    mainViewModel: MainViewModel = hiltViewModel()
) {

    val context = LocalContext.current
    val characterStateResult by mainViewModel.characterList.collectAsState()

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        when (characterStateResult.state) {
            UiStates2.SUCCESS -> {
                Text(text = characterStateResult.characterList.toString())
            }

            UiStates2.FAILURE -> {
                Toast.makeText(context, "No hay datos", Toast.LENGTH_SHORT).show()
            }

            UiStates2.LOADING -> {
                Log.i("DATA", "LOADING")
                Toast.makeText(context, "Cargando", Toast.LENGTH_SHORT).show()
            }

            UiStates2.NONE -> {}
        }

    }
}