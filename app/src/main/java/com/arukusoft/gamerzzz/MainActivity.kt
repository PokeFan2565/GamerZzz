package com.arukusoft.gamerzzz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arukusoft.gamerzzz.ui.theme.GamerZzzTheme
import com.arukusoft.gamerzzz.ui.theme.navigation.AppNavigation
import com.arukusoft.gamerzzz.ui.theme.screens.LoginScreen
import com.arukusoft.gamerzzz.ui.theme.screens.RegisterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GamerZzzTheme {
                // A surface container using the 'background' color from the theme
                AppNavigation(context = this)
            }
        }
    }
}
