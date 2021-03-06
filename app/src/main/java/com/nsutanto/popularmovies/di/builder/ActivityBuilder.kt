package com.nsutanto.popularmovies.di.builder

import com.nsutanto.popularmovies.ui.all_item.AllItemActivity
import com.nsutanto.popularmovies.ui.all_item.AllItemActivityModule
import com.nsutanto.popularmovies.ui.movie_detail.MovieDetailActivity
import com.nsutanto.popularmovies.ui.movie_detail.MovieDetailActivityModule
import com.nsutanto.popularmovies.ui.main.MainActivity
import com.nsutanto.popularmovies.ui.main.MainActivityModule
import com.nsutanto.popularmovies.ui.main.movie.MovieFragment
import com.nsutanto.popularmovies.ui.main.movie.MovieFragmentModule
import com.nsutanto.popularmovies.ui.main.tv.TVFragment
import com.nsutanto.popularmovies.ui.main.tv.TVFragmentModule
import com.nsutanto.popularmovies.ui.tv_detail.TVDetailActivity
import com.nsutanto.popularmovies.ui.tv_detail.TVDetailActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentsModule {
    @ContributesAndroidInjector(modules = [MovieFragmentModule::class])
    abstract fun movieFragment(): MovieFragment

    @ContributesAndroidInjector(modules = [TVFragmentModule::class])
    abstract fun tvFragment(): TVFragment
}

@Module
interface ActivityBuilder {

    @ContributesAndroidInjector(modules =
    [
        MainActivityModule::class,
        MainFragmentsModule::class
    ])
    fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules =
    [
        MovieDetailActivityModule::class
    ])
    fun detailMovieActivity(): MovieDetailActivity

    @ContributesAndroidInjector(modules =
    [
        TVDetailActivityModule::class
    ])
    fun detailTVActivity(): TVDetailActivity

    @ContributesAndroidInjector(modules =
    [
        AllItemActivityModule::class
    ])
    fun allItemActivity(): AllItemActivity
}

