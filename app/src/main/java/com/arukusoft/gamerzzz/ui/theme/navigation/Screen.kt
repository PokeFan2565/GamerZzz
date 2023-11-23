package com.arukusoft.gamerzzz.ui.theme.navigation

sealed class Screen(val route:String){
    object Home: Screen("home")
    object Register : Screen("register")
    object Login : Screen("login")
}
