package com.breezefieldsalesprashant.features.mylearning.apiCall

import com.breezefieldsalesprashant.features.login.api.opportunity.OpportunityListApi
import com.breezefieldsalesprashant.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}