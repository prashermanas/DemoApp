package sample.com.demoapp

import android.app.Activity
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class DemoApplication: DaggerApplication(), HasActivityInjector {

    @Inject lateinit var dispatchingActivityInjector:DispatchingAndroidInjector<Activity>

    override fun activityInjector() = dispatchingActivityInjector

    override fun onCreate() {
        super.onCreate()
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerDemoApplicationComponent.builder().bindsInstance(this).build()
    }
}