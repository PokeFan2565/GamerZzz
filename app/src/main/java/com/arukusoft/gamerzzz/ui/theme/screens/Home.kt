package com.arukusoft.gamerzzz.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arukusoft.gamerzzz.R
import com.arukusoft.gamerzzz.ui.theme.dummyData.GiveAway
import androidx.compose.material3.CardElevation as Material3CardElevation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    // Card Veriables
    val cardTitle = 16.sp
    val subTitle = 12.sp
    BodyLayout {
        val listOfGiveAway: List<GiveAway> = listOf(GiveAway(), GiveAway(), GiveAway())
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ){
            LazyColumn(){
                items(listOfGiveAway){

                    // For Card View
                    Card(
                        onClick = { },
                        elevation = CardDefaults.cardElevation(),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp, horizontal = 10.dp),
                        shape = RoundedCornerShape(4.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.secondaryContainer)

                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 4.dp, vertical = 8.dp)
                        ) {

                            // For Heading
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Image(painter = painterResource(id = R.drawable.registerpersion), contentDescription = "",
                                    modifier = Modifier.size(30.dp)
                                        .clip(CircleShape))
                                Spacer(modifier = Modifier.width(8.dp))
                                Text(
                                    text = it.name,
                                    fontSize = cardTitle,
                                    fontWeight = FontWeight.ExtraBold
                                )
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {


                                // For Details

                                Column(
                                    modifier = Modifier.padding(horizontal = 12.dp)
                                ) {
                                    Text(text = "Price : ${it.price}",
                                        fontSize = subTitle,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(end = 4.dp))
                                    Text(text = "Price : ${it.totalWinner}",
                                        fontSize = subTitle,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.padding(end = 4.dp))
                                }


                                // For Button
                                Row(
                                    horizontalArrangement = Arrangement.End
                                ) {
                                    OutlinedButton(
                                        onClick = { /*TODO*/ },
                                        shape = RoundedCornerShape(4.dp)
                                    ) {
                                        Text(text = "Join")
                                    }
                                }

                            }

                        }
                    }
                }
            }
        }
    }
}

