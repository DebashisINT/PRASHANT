package com.breezefieldsalesprashant.features.viewAllOrder.interf

import com.breezefieldsalesprashant.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprashant.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}