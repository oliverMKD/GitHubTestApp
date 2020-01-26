package com.oli.githubtestapp.search.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map
import com.oli.githubtestapp.app.GitHubApp
import com.oli.githubtestapp.network.GitApiService
import com.oli.githubtestapp.network.responses.ItemResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SearchRepository {

    @Inject
    lateinit var gitApiService: GitApiService

    init {
        GitHubApp.instance.getAppComponent().inject(this)
    }

    lateinit var itemsResponse: LiveData<List<ItemResponse>>

    val exception = MutableLiveData<Exception>()

    suspend fun getItems() {
        withContext(Dispatchers.IO) {
            try {
                val cars = gitApiService.getItems()
                //do something with result
                cars?.let {
                    for (car in cars) {
                        car?.let {
                            itemsResponse.map { car }
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                withContext(Dispatchers.Main) {
                    exception.value = e
                }
            }
        }
    }
}