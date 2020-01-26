package com.oli.githubtestapp.app

import com.oli.githubtestapp.network.GitApiService
import com.oli.githubtestapp.network.modules.NetworkModule
import com.oli.githubtestapp.search.repositories.SearchRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun gitApiService(): GitApiService

    fun inject(repository: SearchRepository)
}