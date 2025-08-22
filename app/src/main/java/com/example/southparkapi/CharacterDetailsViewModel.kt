package com.example.southparkapi

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CharacterDetailsViewModel(savedStateHandle: SavedStateHandle) : ViewModel() {
    private val characterId = savedStateHandle.get<Int>("characterId") ?: 0
    private val _character = mutableStateOf<CharacterDetailResponse?>(null)
    val character: State<CharacterDetailResponse?> = _character

    init {
        loadCharacter()
    }

    private fun loadCharacter() {
        viewModelScope.launch {
            val character = APIClient.api.getCharactersDetails(characterId)
            _character.value = character
        }
    }

}
