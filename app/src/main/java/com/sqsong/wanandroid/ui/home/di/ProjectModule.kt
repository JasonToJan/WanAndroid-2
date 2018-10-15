package com.sqsong.wanandroid.ui.home.di

import com.sqsong.wanandroid.di.scope.FragmentScope
import com.sqsong.wanandroid.ui.home.fragment.ProjectFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ProjectModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeProjectFragment(): ProjectFragment

}