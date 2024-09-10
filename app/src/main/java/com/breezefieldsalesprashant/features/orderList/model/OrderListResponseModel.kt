package com.breezefieldsalesprashant.features.orderList.model

import com.breezefieldsalesprashant.base.BaseResponse

/**
 * Created by Saikat on 01-10-2018.
 */
class OrderListResponseModel : BaseResponse() {
    var order_list: List<OrderListDataModel>? = null
}