package tat.mukhutdinov.lesson20

import android.app.Application
import tat.mukhutdinov.lesson20.data.AppContainer
import tat.mukhutdinov.lesson20.data.AppDataContainer

class JuiceTrackerApplication : Application() {
    /**
     * AppContainer instance used by the rest of classes to obtain dependencies
     */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
