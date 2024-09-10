package com.breezefieldsalesprashant.features.login.model.opportunitymodel

import com.breezefieldsalesprashant.app.domain.OpportunityStatusEntity
import com.breezefieldsalesprashant.app.domain.ProductListEntity
import com.breezefieldsalesprashant.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}