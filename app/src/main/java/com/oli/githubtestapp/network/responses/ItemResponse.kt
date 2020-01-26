package com.oli.githubtestapp.network.responses

import com.google.gson.annotations.SerializedName
import com.oli.githubtestapp.search.model.GitItem

data class ItemResponse (
    @SerializedName("total_count") val totalCount: Int,
    @SerializedName("incomplete_results") val incompleteResults: Boolean,
    @SerializedName("items") val items: List<GitItem>
)