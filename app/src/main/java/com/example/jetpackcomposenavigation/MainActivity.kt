package com.example.jetpackcomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposenavigation.navigation.AppNavigation
import com.example.jetpackcomposenavigation.screens.firstScreen
import com.example.jetpackcomposenavigation.ui.theme.JetpackComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeNavigationTheme {
                Surface(color = MaterialTheme.colors.background) {
                    AppNavigation()
                }

            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    JetpackComposeNavigationTheme {
        AppNavigation()
    }
}

