package com.fisma.marketplacefisma.core.di

import com.fisma.marketplacefisma.core.data.repository.AppRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { AppRepository(get(),get()) }
}