package com.arukusoft.gamerzzz.ui.theme.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arukusoft.gamerzzz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navigate: () -> Unit) {

    // Text Field Veriables
    var email: String by remember {
        mutableStateOf("")
    }

    var password: String by remember {
        mutableStateOf("")
    }

    // Screen Design Veriables
    val formPadding = 24.dp
    val policyFontSize = 12.sp

    // Main Body
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.registerpersion),
                contentDescription = "Logo"
            )
            Text(
                text = "Log-In",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(horizontal = formPadding)
            ) {

                // For Email
                OutlinedTextField(
                    value = email, onValueChange = {
                        email = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email, contentDescription = "icon")
                    },
                    label = {
                        Text(text = "Email")
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next
                    )
                )

                // For Password
                OutlinedTextField(
                    value = password, onValueChange = {
                        password = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock, contentDescription = "Icon")
                    },
                    label = {
                        Text(text = "Password")
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    )
                )
            }

            // For Continue Button
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.width(250.dp),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text(
                    text = "Continue",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Spacer(modifier = Modifier.height(4.dp))


            // For Praivecy And Policy
            Text(
                text = "By Clicking Continue You Are Agree To Ower Privecy Policy",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = policyFontSize
            )
            Row {
                Text(text = "New User ? ", fontSize = policyFontSize)
                Text(
                    text = "Create Account",
                    modifier = Modifier.clickable { navigate() },
                    fontSize = policyFontSize,
                    color = Color.Blue
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ShowMyScren() {
    LoginScreen(){}
}