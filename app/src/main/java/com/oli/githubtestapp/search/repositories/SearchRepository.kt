package com.oli.githubtestapp.search.repositories

import androidx.lifecycle.MutableLiveData
import com.oli.githubtestapp.app.GitHubApp
import com.oli.githubtestapp.network.GitApiService
import javax.inject.Inject

class SearchRepository {

    @Inject
    lateinit var gitApiService: GitApiService

    init {
        GitHubApp.instance.getAppComponent().inject(this)
    }

    val exception = MutableLiveData<Exception>()

}