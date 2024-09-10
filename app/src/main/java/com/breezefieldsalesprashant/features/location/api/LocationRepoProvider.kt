package com.breezefieldsalesprashant.features.location.api

import com.breezefieldsalesprashant.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldsalesprashant.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}