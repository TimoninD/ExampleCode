package ru.rocket.template

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWorldComponent("Rocket It")
        }
    }

    @Composable
    fun HelloWorldComponent(name: String) {
        Text(text = "Hello, $name")
    }
}