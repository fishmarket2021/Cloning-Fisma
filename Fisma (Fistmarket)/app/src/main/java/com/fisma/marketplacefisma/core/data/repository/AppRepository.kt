package com.fisma.marketplacefisma.core.data.repository

import com.fisma.marketplacefisma.core.data.source.local.LocalDataSource
import com.fisma.marketplacefisma.core.data.source.remote.RemoteDataSource

class AppRepository(val lokal:LocalDataSource, val remote:RemoteDataSource) {

}