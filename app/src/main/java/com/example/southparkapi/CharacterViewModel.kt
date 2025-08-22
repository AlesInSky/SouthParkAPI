package com.example.southparkapi

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CharacterViewModel : ViewModel() {
    private val _characters = mutableStateListOf<CharacterResponse>()
    val characters: List<CharacterResponse> = _characters

    fun loadCharactersList() {
        viewModelScope.launch {
            for (id in 1..50)
                try {
                    val character = APIClient.api.getCharacters(id)
                    _characters.add(character)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
        }
    }
}