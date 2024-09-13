package com.tulgot.ricknmorty.presentation

import androidx.lifecycle.ViewModel
import com.tulgot.ricknmorty.data.RicknMortyRepositoryImp
import com.tulgot.ricknmorty.domain.model.Response
import dagger.hilt.android.lifecycle.HiltViewModel
import java.util.concurrent.Flow
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(ricknMortyRepositoryImp: RicknMortyRepositoryImp) :
    ViewModel() {


//    val characters = ricknMortyRepositoryImp.getCharacterList()

}