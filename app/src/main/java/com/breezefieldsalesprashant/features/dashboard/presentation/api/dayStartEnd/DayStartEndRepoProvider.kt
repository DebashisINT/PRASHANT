package com.breezefieldsalesprashant.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldsalesprashant.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldsalesprashant.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}