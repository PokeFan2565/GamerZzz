package com.arukusoft.gamerzzz.ui.theme.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AccountCircle
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arukusoft.gamerzzz.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen() {

    // Text Field Veriables
    var name: String by remember {
        mutableStateOf("")
    }
    var gameId: String by remember {
        mutableStateOf("")
    }
    var email: String by remember {
        mutableStateOf("")
    }
    var password: String by remember {
        mutableStateOf("")
    }
    var confirmPassword: String by remember {
        mutableStateOf("")
    }

    // Screen Veriables
    val formPadding = 20.dp
    val policyFontSize = 12.sp
    val registerIconSize = 150.dp
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.registerpersion),
                contentDescription = "Register Image",
                modifier = Modifier.size(registerIconSize)
            )
            Text(
                text = "Register",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.ExtraBold
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier.padding(horizontal = formPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                // For Name
                OutlinedTextField(
                    value = name, onValueChange = {
                        name = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Name"
                        )
                    },
                    label = {
                        Text(text = "Name")
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next
                    )
                )

                // For GameId
                OutlinedTextField(
                    value = gameId, onValueChange = {
                        gameId = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.AccountBox,
                            contentDescription = "GameId"
                        )
                    },
                    label = {
                        Text(text = "GameID")
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next
                    )
                )

                // For Email
                OutlinedTextField(
                    value = email, onValueChange = {
                        email = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email"
                        )
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
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "password"
                        )
                    },
                    label = {
                        Text(text = "Password")
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next
                    )
                )

                // For Confirm Password

                OutlinedTextField(
                    value = confirmPassword, onValueChange = {
                        confirmPassword = it
                    },
                    modifier = Modifier.fillMaxWidth(),
                    leadingIcon = {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "confirm password"
                        )
                    },
                    label = {
                        Text(text = "Confirm Password")
                    },
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done
                    )
                )

                // For Submit Button
                Spacer(modifier = Modifier.height(20.dp))
                OutlinedButton(
                    modifier = Modifier.width(200.dp),
                    shape = RoundedCornerShape(4.dp),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        text = "Continue",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.ExtraBold
                    )
                }


            }

            // For Term And Conditions
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "By Clicking Continue You Are Agree To Ower Privecy Policy",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = policyFontSize
            )
            Row {
                Text(text = "Existing User ? ", fontSize = policyFontSize)
                Text(text = "Log-In", fontSize = policyFontSize,
                    color = Color.Blue)
            }
        }
    }

}