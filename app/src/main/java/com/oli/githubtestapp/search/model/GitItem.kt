package com.oli.githubtestapp.search.model

import com.google.gson.annotations.SerializedName

data class GitItem(
    @SerializedName("full_name")
    private val fullName: String?,
    @SerializedName("owner")
    private val owner: Owner?,
    @SerializedName("description")
    private val description: String?,
    @SerializedName("watchers_count")
    private val watchersCount: Int?,
    @SerializedName("forks_count")
    private val forksCount: Int?,
    @SerializedName("open_issues_count")
    private val openIssuesCount: Int?
)