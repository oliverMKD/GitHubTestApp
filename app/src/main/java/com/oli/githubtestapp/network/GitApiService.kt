package com.oli.githubtestapp.network

import com.oli.githubtestapp.network.responses.ItemResponse
import retrofit2.http.GET

interface GitApiService {
    @GET("search/repositories?")
    suspend fun getItems(): List<ItemResponse?>?
}