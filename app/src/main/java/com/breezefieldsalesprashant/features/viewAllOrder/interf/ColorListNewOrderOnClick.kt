package com.breezefieldsalesprashant.features.viewAllOrder.interf

import com.breezefieldsalesprashant.app.domain.NewOrderColorEntity
import com.breezefieldsalesprashant.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}