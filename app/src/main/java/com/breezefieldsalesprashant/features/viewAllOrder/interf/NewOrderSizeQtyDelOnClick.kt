package com.breezefieldsalesprashant.features.viewAllOrder.interf

import com.breezefieldsalesprashant.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprashant.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}