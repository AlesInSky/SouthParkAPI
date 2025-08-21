package com.example.southparkapi

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CharacterViewModel: ViewModel() {
    val characters = mutableStateListOf<CharacterResponse>()

    fun loadCharacters(){
        viewModelScope.launch {
            for (id in 1..10)
            try {
                val character = APIClient.api.getCharacters(id)
                characters.add(character)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }

}