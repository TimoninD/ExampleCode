package ru.daniil.example

import android.app.Application
import org.koin.core.context.startKoin
import ru.daniil.example.di.ViewModelModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(
                    ViewModelModule().module
                )
            )
        }
    }
}