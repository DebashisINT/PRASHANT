package com.breezefieldsalesprashant.features.nearbyuserlist.api

import com.breezefieldsalesprashant.app.Pref
import com.breezefieldsalesprashant.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldsalesprashant.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldsalesprashant.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}