package com.fisma.marketplacefisma.util

import android.app.Application
import com.fisma.marketplacefisma.core.di.appModule
import com.fisma.marketplacefisma.core.di.repositoryModule
import com.fisma.marketplacefisma.core.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(appModule, viewModelModule, repositoryModule))
        }
    }
}