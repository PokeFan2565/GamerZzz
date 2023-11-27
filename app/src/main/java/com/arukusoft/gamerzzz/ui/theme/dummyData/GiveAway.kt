package com.arukusoft.gamerzzz.ui.theme.dummyData

data class GiveAway(
    val id: String = "HJfHv*9865",
    val name: String = "My First GiveAway",
    val description: String = "See My Youtube Video To Get Code For Participating In This GiveAway",
    val price: String = "100 Diamonds",
    val totalWinner: String = "12"
)

data class GiveAwayCandidates(
    val candidates: List<String> = listOf("Alok Mistry", "Rohit Mandal", "Akash Biswas", "GameXChatter", "Gaming Tactics")
)
