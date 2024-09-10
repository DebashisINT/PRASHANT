package com.breezefieldsalesprashant.features.login.model.productlistmodel

import com.breezefieldsalesprashant.app.domain.ModelEntity
import com.breezefieldsalesprashant.app.domain.ProductListEntity
import com.breezefieldsalesprashant.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}