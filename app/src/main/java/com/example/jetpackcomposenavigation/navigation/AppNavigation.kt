package com.example.jetpackcomposenavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.jetpackcomposenavigation.screens.firstScreen
import com.example.jetpackcomposenavigation.screens.SecondScreen

// añadir libreria gradle
@Composable
fun AppNavigation() {
    // constante : gestiona el estado de navegacion entre las pantallas
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.firstScreen.route) {
        composable(route = AppScreens.firstScreen.route) {
            firstScreen(navController)
        }
        composable(
            route = AppScreens.secondScreen.route + "/{text}", // para pasar un parametro de una pantalla a otra, usar text y arguments
            arguments = listOf(navArgument(name = "text") {
            type= NavType.StringType
            })
        ) {
            SecondScreen(navController,it.arguments?.getString("text"))
        }
    }
}