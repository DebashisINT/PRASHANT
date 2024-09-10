package com.breezefieldsalesprashant.features.viewAllOrder.interf

import com.breezefieldsalesprashant.app.domain.NewOrderProductEntity
import com.breezefieldsalesprashant.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}