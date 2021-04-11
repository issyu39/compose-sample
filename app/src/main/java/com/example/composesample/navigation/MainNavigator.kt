package com.example.composesample.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composesample.ui.screens.detail.DetailScreen
import com.example.composesample.ui.screens.home.HomeScreen

@Composable
fun MainNavigator() {
    val mainNavController = rememberNavController()
    NavHost(
        navController = mainNavController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen() }
        composable("detail") { DetailScreen() }
    }
}
