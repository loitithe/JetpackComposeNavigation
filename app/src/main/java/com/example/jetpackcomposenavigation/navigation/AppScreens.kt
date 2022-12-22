package com.example.jetpackcomposenavigation.navigation

/** Centraliza las pantallas
 *
 */
sealed class AppScreens(val route:String){
    object firstScreen:AppScreens("first_screen")
    object secondScreen:AppScreens("second_screen")

}
