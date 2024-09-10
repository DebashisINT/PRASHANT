package com.breezefieldsalesprashant.features.viewAllOrder.interf

import com.breezefieldsalesprashant.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprashant.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}