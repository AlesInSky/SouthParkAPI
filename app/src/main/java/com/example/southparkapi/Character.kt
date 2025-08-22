package com.example.southparkapi

data class CharacterResponse(
    val data: Character,
)

data class CharacterDetailResponse(
    val data: CharacterDetail,
)

data class Character(
    val id: Int,
    val name: String?,
)

data class CharacterDetail(
    val id: Int,
    val name: String?,
    val age: String?,
    val sex: String,
    val hairColor: String,
    val occupation: String,
    val religion: String,
)
