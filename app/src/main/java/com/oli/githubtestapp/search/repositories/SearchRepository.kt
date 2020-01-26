package com.oli.githubtestapp.search.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.oli.githubtestapp.app.GitHubApp
import com.oli.githubtestapp.network.GitApiService
import com.oli.githubtestapp.network.responses.ItemResponse
import javax.inject.Inject

class SearchRepository {

    @Inject
    lateinit var gitApiService: GitApiService

    init {
        GitHubApp.instance.getAppComponent().inject(this)
    }

    lateinit var itemsResponse: LiveData<List<ItemResponse>>

    val exception = MutableLiveData<Exception>()
    

}