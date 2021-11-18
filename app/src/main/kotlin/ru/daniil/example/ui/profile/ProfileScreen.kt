package ru.daniil.example.ui.profile

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.koin.androidx.compose.getViewModel
import ru.daniil.example.viewmodel.ProfileViewModel

@Composable
fun ProfileScreen() {
    val viewModel = getViewModel<ProfileViewModel>()
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "It's profile", style = TextStyle(
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                fontFamily = FontFamily.SansSerif
            )
        )
    }
}