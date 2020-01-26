package com.oli.githubtestapp.search.model

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("login")
    private val login: String?,
    @SerializedName("avatar_url")
    private val avatarUrl: String?,
    @SerializedName("gravatar_id")
    private val gravatarId: String?,
    @SerializedName("url")
    private val url: String?,
    @SerializedName("html_url")
    private val htmlUrl: String?,
    @SerializedName("organizations_url")
    private val organizationsUrl: String?,
    @SerializedName("repos_url")
    private val reposUrl: String?
)