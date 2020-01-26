package com.oli.githubtestapp.app

import android.app.Application
import com.oli.githubtestapp.network.modules.NetworkModule
import com.oli.githubtestapp.network.modules.OkHttpClientModule

class GitHubApp : Application() {

    companion object {
        lateinit var instance: GitHubApp
    }

    private lateinit var appComponent: AppComponent

    init {
        instance = this
    }
    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .networkModule(NetworkModule())
            .okHttpClientModule(OkHttpClientModule())
            .build()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }

}