package com.breezefieldsalesprashant.features.stockAddCurrentStock.api

import com.breezefieldsalesprashant.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldsalesprashant.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}