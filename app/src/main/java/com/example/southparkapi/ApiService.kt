package com.example.southparkapi

import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("characters/{id}")
    suspend fun getCharacters(@Path("id") id: Int): CharacterResponse

    @GET("characters/{id}")
    suspend fun getCharactersDetails(@Path("id") id: Int): CharacterDetailResponse
}