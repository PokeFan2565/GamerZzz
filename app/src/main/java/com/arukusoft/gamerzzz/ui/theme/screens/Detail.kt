package com.arukusoft.gamerzzz.ui.theme.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionLocalContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.arukusoft.gamerzzz.ui.theme.dummyData.GiveAway
import com.arukusoft.gamerzzz.ui.theme.dummyData.GiveAwayCandidates

@Composable
fun GiveAwayDetailScreen(context: Context) {
    // Demo Data
    val giveAway = GiveAway()
    val giveAwayCandidates = GiveAwayCandidates()
    val candidates = giveAwayCandidates.candidates
    // Detail Screen
    BodyLayout {
        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter){
            Column {
                // For Card View
                GiveAwayCardView(it = giveAway, showJoinButton = false)

                // Title
                Text(text = "Candidates : ",
                    fontWeight = FontWeight.ExtraBold,
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.Blue,
                    modifier = Modifier.padding(start = 10.dp))
                // For Showing Candidates
                LazyColumn(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ){
                    items(candidates){
                        Row (
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 2.dp)
                                .border(2.dp, Color.Black, RoundedCornerShape(4.dp))
                                .padding(start = 10.dp, end = 4.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ){
                            Text(text = it)
                            OutlinedButton(
                                onClick = {
                                    Toast.makeText(
                                        context,
                                        "This Feture Is Not Available",
                                        Toast.LENGTH_SHORT
                                    ).show() },
                                shape = RoundedCornerShape(4.dp),
                                elevation = ButtonDefaults.buttonElevation(defaultElevation = 24.dp)
                            ) {
                                Text(text = "Profile",
                                    modifier = Modifier.background(Color.Transparent))
                            }
                        }
                    }
                }
            }


        }
    }
}