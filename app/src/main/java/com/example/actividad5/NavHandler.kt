package com.example.actividad5

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.actividad5.Views.HomeView
import com.example.actividad5.Views.GameView
import com.example.actividad5.Views.FinalView

@Composable
fun NavManager() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "HomeView") {

        //Definiendo Rutas
        composable(route = "HomeView") {
            HomeView(navController)
        }

        composable(route = "GameView/{age}/{budget}", arguments =
        listOf(
            navArgument("age") {type = NavType.IntType},
            navArgument("budget") {type = NavType.IntType}
        )) {
                parameters ->
            val age = parameters.arguments?.getInt("age") ?: 0
            val budget = parameters.arguments?.getInt("budget") ?: 0

            GameView(navController, age, budget)
        }

        composable(route = "FinalView/{total}", arguments =
        listOf(
            navArgument("total") {type = NavType.IntType}
        )) {
                parameters ->
            val total = parameters.arguments?.getInt("total") ?: 0

            FinalView(navController, total)
        }
    }
}