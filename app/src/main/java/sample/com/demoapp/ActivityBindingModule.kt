package sample.com.demoapp

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [])
    abstract fun bindMainActivity():MainActivity
}