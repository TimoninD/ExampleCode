package ru.daniil.example.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.daniil.example.viewmodel.CoinListViewModel
import ru.daniil.example.viewmodel.NewsViewModel
import ru.daniil.example.viewmodel.ProfileViewModel

class ViewModelModule {

    val module = module {
        viewModel { NewsViewModel() }
        viewModel { ProfileViewModel() }
        viewModel { CoinListViewModel() }
    }
}