package ru.daniil.example.ui.news

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import org.koin.androidx.compose.getViewModel
import ru.daniil.example.viewmodel.NewsViewModel

@Composable
fun NewsScreen() {
    val viewModel = getViewModel<NewsViewModel>()
    Column {
        for (i in 0..100) {
            Text(text = "It's $i position")
        }
    }
}