package com.example.southparkapi

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CharacterDetailsScreen(viewModel: CharacterDetailsViewModel = viewModel()) {
    val character by viewModel.character
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = ("Name: " + character?.data?.name),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = ("Sex: " + character?.data?.sex),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = ("Age: " + character?.data?.age),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = ("Hair color: " + character?.data?.hairColor),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = ("Occupation: " + character?.data?.occupation),
            modifier = Modifier.padding(16.dp)
        )
    }
}