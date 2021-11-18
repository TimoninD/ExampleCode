package ru.daniil.example.ui.main

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ru.daniil.example.navigation.BottomNavigationScreens
import ru.daniil.example.ui.coinList.CoinListScreen
import ru.daniil.example.ui.component.MainBottomNavigation
import ru.daniil.example.ui.news.NewsScreen
import ru.daniil.example.ui.profile.ProfileScreen


@Composable
fun MainScreen() {

    val navController = rememberNavController()

    val bottomNavigationItems = listOf(
        BottomNavigationScreens.CoinList,
        BottomNavigationScreens.News,
        BottomNavigationScreens.Profile,
    )
    Scaffold(
        bottomBar = {
            MainBottomNavigation(navController, bottomNavigationItems)
        },
    ) {
        MainScreenNavigationConfigurations(navController)
    }
}

@Composable
private fun MainScreenNavigationConfigurations(
    navController: NavHostController
) {
    NavHost(navController, startDestination = BottomNavigationScreens.CoinList.route) {
        composable(BottomNavigationScreens.CoinList.route) {
            CoinListScreen()
        }
        composable(BottomNavigationScreens.News.route) {
            NewsScreen()
        }
        composable(BottomNavigationScreens.Profile.route) {
            ProfileScreen()
        }
    }
}