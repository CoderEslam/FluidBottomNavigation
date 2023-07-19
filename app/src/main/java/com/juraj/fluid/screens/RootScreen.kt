package com.juraj.fluid.screens

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.juraj.fluid.MainScreen
import com.juraj.fluid.constant.Route


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RootScreen() {

    val bottomNavController = rememberNavController()

    Scaffold (
        bottomBar = { MainScreen(bottomNavController) }
    ) {

        NavHost(
            navController = bottomNavController,
            startDestination = Route.HOME_SCREEN
        ) {

            composable(Route.HOME_SCREEN) {
                HomeScreen(navController = bottomNavController)
            }

            composable(Route.PROFILE_SCREEN) {
                ProfileScreen(navController = bottomNavController)
            }

        }

    }

}