package com.breezefieldsalesprashant.features.lead.api

import com.breezefieldsalesprashant.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldsalesprashant.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}