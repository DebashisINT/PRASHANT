package com.breezefieldsalesprashant.features.newcollection.model

import com.breezefieldsalesprashant.app.domain.CollectionDetailsEntity
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}