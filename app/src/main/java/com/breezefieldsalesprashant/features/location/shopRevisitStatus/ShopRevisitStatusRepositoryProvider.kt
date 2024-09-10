package com.breezefieldsalesprashant.features.location.shopRevisitStatus

import com.breezefieldsalesprashant.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesprashant.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}