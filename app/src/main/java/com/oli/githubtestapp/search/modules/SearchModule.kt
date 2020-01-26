package com.oli.githubtestapp.search.modules

import com.oli.githubtestapp.search.repositories.SearchRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class SearchModule {

    @Provides
    @Singleton
    fun searchRepository(): SearchRepository = SearchRepository()

//    @Provides
//    @Singleton
//    fun providesSearchViewModelFactory(searchRepository: SearchRepository): SearchViewModelFactory {
//        return SearchViewModelFactory(searchRepository)
//    }
}