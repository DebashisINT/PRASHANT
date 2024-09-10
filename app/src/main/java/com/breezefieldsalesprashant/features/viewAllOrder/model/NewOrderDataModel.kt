package com.breezefieldsalesprashant.features.viewAllOrder.model

import com.breezefieldsalesprashant.app.domain.NewOrderColorEntity
import com.breezefieldsalesprashant.app.domain.NewOrderGenderEntity
import com.breezefieldsalesprashant.app.domain.NewOrderProductEntity
import com.breezefieldsalesprashant.app.domain.NewOrderSizeEntity
import com.breezefieldsalesprashant.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

