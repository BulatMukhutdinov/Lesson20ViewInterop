package tat.mukhutdinov.lesson20.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import tat.mukhutdinov.lesson20.JuiceTrackerApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for JuiceTrackerViewModel
        initializer {
            JuiceTrackerViewModel(juiceTrackerApplication().container.juiceRepository)
        }
    }
}
/**
 * Extension function to queries for [Application] object and returns an instance of
 * [JuiceTrackerApplication].
 */
fun CreationExtras.juiceTrackerApplication(): JuiceTrackerApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as JuiceTrackerApplication)
