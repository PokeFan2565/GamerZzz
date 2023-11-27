package com.arukusoft.gamerzzz.ui.theme.navigation

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arukusoft.gamerzzz.ui.theme.screens.GiveAwayDetailScreen
import com.arukusoft.gamerzzz.ui.theme.screens.HomeScreen
import com.arukusoft.gamerzzz.ui.theme.screens.LoginScreen
import com.arukusoft.gamerzzz.ui.theme.screens.RegisterScreen

@Composable
fun AppNavigation(context: Context) {
    val navHostController = rememberNavController()
    NavHost(navController = navHostController, startDestination = Screen.Home.route){

        composable(Screen.Login.route){
            LoginScreen {
                navHostController.navigate(Screen.Register.route)
            }
        }
        composable(Screen.Register.route){
            RegisterScreen {
                navHostController.navigate(Screen.Login.route)
            }
        }
        composable(Screen.Home.route){
            HomeScreen(){
                navHostController.navigate(Screen.Detail.route)
            }
        }

        composable(Screen.Detail.route){
            GiveAwayDetailScreen(context = context)
        }
    }
}

