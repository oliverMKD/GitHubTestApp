package com.oli.githubtestapp.search.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oli.githubtestapp.network.responses.ItemResponse
import com.oli.githubtestapp.search.repositories.SearchRepository
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class SearchViewModel internal constructor(
    private val searchRepository: SearchRepository
) : ViewModel() {

    val itemsResponse: LiveData<List<ItemResponse>> = searchRepository.itemsResponse
    val exception: MutableLiveData<Exception> = searchRepository.exception

    fun getItems() {
        viewModelScope.launch {
            searchRepository.getItems()
        }
    }

    /**
     * Cancel all coroutines when the ViewModel is cleared.
     */
    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }

}