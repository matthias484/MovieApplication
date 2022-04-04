package com.example.movieapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapplication.screens.detail.DetailScreen
import models.HomeScreen

@Composable
fun MovieNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name){
        composable(MovieScreens.HomeScreen.name){ HomeScreen(navController = navController)}

        composable(MovieScreens.DetailScreen.name + "/{movie}",
            arguments = listOf(navArgument("movie"){
                type = NavType.StringType
            })
        ){ backStackEntry ->

            DetailScreen(navController = navController, movieId = backStackEntry.arguments?.getString("movie") )
        }

    }

}