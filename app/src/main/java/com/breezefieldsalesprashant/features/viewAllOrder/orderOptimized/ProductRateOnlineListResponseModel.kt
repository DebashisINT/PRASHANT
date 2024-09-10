package com.breezefieldsalesprashant.features.viewAllOrder.orderOptimized

import com.breezefieldsalesprashant.app.domain.ProductOnlineRateTempEntity
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}