package com.example.jetpackcomposenavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.jetpackcomposenavigation.navigation.AppScreens

@Composable
fun firstScreen(navController: NavController) {
    // componente grafico para estructurar una pantalla
    Scaffold (topBar = {
        TopAppBar() {
            Text(text = "firstScreen")
        }
    }
            ){
        firstBodyContent(navController)
    }

}

@Composable
fun firstBodyContent(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hi navigation")
        Button(onClick = {
            navController.navigate(route = AppScreens.secondScreen.route+"/Este es un parametro")
        }) {
            Text("Navega")
        }
    }
}

