package sample.com.demoapp

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class,ActivityBindingModule::class])
interface DemoApplicationComponent:AndroidInjector<DemoApplication> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun bindsInstance(application: Application):DemoApplicationComponent.Builder

        fun build():DemoApplicationComponent
    }

}