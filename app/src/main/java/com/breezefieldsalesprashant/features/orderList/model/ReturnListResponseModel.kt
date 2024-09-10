package com.breezefieldsalesprashant.features.orderList.model

import com.breezefieldsalesprashant.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}