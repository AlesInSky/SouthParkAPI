package com.example.southparkapi

data class CharacterResponse(
    val data: Character
)

data class Character(
    val id: Int,
    val name: String?
)