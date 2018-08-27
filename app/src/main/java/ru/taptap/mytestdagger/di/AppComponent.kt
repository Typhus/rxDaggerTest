package ru.taptap.mytestdagger.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import ru.taptap.mytestdagger.presentation.TestApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, AppModule::class, FeedActivityModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: TestApplication): Builder

        fun build(): AppComponent
    }

    fun inject(application: TestApplication)
}