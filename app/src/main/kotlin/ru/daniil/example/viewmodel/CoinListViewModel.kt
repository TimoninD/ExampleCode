package ru.daniil.example.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class CoinListViewModel : ViewModel() {

    var uiState by mutableStateOf(ViewState())
        private set

    init {
        loadMockData()
    }

    private fun loadMockData() {
        viewModelScope.launch {
            uiState = uiState.copy(isLoading = true)
            withContext(Dispatchers.IO) {
                delay(500)
                withContext(Dispatchers.Main) {
                    uiState = uiState.copy(isLoading = false, listItems = listOf(1, 2, 3, 4, 5))
                }
            }
        }
    }

    data class ViewState(val isLoading: Boolean = false, val listItems: List<Int> = emptyList())
}