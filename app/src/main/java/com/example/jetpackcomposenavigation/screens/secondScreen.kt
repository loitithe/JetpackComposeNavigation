package com.example.jetpackcomposenavigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, text: String?) {
    // componente grafico para estructurar una pantalla
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrow back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "SecondScreen")
        }
    }
    ) {
        SecondBodyContent(navController,text)
    }

}

@Composable
fun SecondBodyContent(navController: NavController, text: String?) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hi navigation")
        // en caso de que se le pase el parametro string ,este se pinta 
        text?.let {
            Text(it)
        }
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Volver atrás")
        }
    }
}

