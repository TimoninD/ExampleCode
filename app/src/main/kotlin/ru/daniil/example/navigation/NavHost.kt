package ru.daniil.example.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Autorenew
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.VerifiedUser
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(val route: String, val icon: ImageVector) {
    object CoinList : BottomNavigationScreens("coin_list", Icons.Filled.Money)
    object News : BottomNavigationScreens("news", Icons.Filled.Autorenew)
    object Profile : BottomNavigationScreens("profile", Icons.Filled.VerifiedUser)
}