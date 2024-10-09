package tat.mukhutdinov.lesson20

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import tat.mukhutdinov.lesson20.ui.JuiceTrackerApp
import tat.mukhutdinov.lesson20.ui.theme.JuiceTrackerTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JuiceTrackerTheme {
                JuiceTrackerApp()
            }
        }
    }
}
