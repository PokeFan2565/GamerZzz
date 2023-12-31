package com.arukusoft.gamerzzz.ui.theme.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BodyLayout(
    screenTitle:String = "GamerZzz",
    content: @Composable () -> Unit
    ) {
    Scaffold(
        topBar = {


            TopAppBar(
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),

                title = {
                    Text(text = screenTitle,
                        fontWeight = FontWeight.ExtraBold)
                }
            )
        }
    ){
        Surface(
            modifier = Modifier.padding(vertical = it.calculateTopPadding())
        ) {
            content()
        }
    }
}