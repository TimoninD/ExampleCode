package ru.daniil.example.ui.component

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import ru.daniil.example.navigation.BottomNavigationScreens

@Composable
fun MainBottomNavigation(
    navController: NavHostController,
    items: List<BottomNavigationScreens>
) {

    BottomNavigation {
        var currentRoute by remember { mutableStateOf(items.firstOrNull()?.route) }
        items.forEach { screen ->
            BottomNavigationItem(
                icon = { Icon(screen.icon, null) },
                label = { Text(screen.route) },
                selected = currentRoute == screen.route,
                onClick = {
                    // This if check gives us a "singleTop" behavior where we do not create a
                    // second instance of the composable if we are already on that destination
                    if (currentRoute != screen.route) {
                        navController.navigate(screen.route)
                        currentRoute = screen.route
                    }
                }
            )
        }
    }
}
