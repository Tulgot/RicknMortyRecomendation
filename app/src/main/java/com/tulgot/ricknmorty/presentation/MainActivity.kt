package com.tulgot.ricknmorty.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.tulgot.ricknmorty.data.RicknMortyApi
import com.tulgot.ricknmorty.data.toResponse
import com.tulgot.ricknmorty.di.ApiModule
import com.tulgot.ricknmorty.ui.theme.RicknMortyTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity(
) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*GlobalScope.launch {
            var chracterlsit = ApiModule.provideApiService().getCharacters().toResponse()
            Log.i("trafalgar", chracterlsit.toString())
        }*/


        setContent {


            RicknMortyTheme {

                CharacterListScreen()

            }
        }


    }
}
