package com.breezefieldsalesprashant.features.document.api

import com.breezefieldsalesprashant.features.dymanicSection.api.DynamicApi
import com.breezefieldsalesprashant.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}