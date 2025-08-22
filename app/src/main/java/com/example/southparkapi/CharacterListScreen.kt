package com.example.southparkapi

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CharacterListScreen(
    navController: NavController,
    viewModel: CharacterViewModel = viewModel(),
) {
    LaunchedEffect(Unit) {
        viewModel.loadCharactersList()
    }

    LazyColumn {
        items(viewModel.characters) { character ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onClick = { navController.navigate("detailScreen/${character.data.id}") }
            ) {
                Text(
                    text = character.data.name ?: "None",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}