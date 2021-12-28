package com.fisma.marketplacefisma.core.di

import com.fisma.marketplacefisma.core.data.source.local.LocalDataSource
import com.fisma.marketplacefisma.core.data.source.remote.RemoteDataSource
import com.fisma.marketplacefisma.core.data.source.remote.network.ApiConfig
import org.koin.dsl.module

val appModule = module {
    single { ApiConfig.provideApiService }

    single { RemoteDataSource(get()) }

    single { LocalDataSource() }
}