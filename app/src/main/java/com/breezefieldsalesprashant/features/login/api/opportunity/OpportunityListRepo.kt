package com.breezefieldsalesprashant.features.login.api.opportunity

import com.breezefieldsalesprashant.app.Pref
import com.breezefieldsalesprashant.app.utils.AppUtils
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.addshop.model.AudioFetchDataCLass
import com.breezefieldsalesprashant.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesprashant.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.breezefieldsalesprashant.features.login.model.productlistmodel.ProductListResponseModel
import com.breezefieldsalesprashant.features.orderITC.SyncDeleteOppt
import com.breezefieldsalesprashant.features.orderITC.SyncEditOppt
import com.breezefieldsalesprashant.features.orderITC.SyncOppt
import com.breezefieldsalesprashant.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }

    fun getAudioL(user_id: String,data_limit_in_days:String): Observable<AudioFetchDataCLass> {
        return apiService.getAudioLApi(user_id,data_limit_in_days)
    }


    fun saveLMSModuleInfo(obj: DashboardActivity.LMSModule): Observable<BaseResponse> {
        return apiService.saveLMSModuleInfoApi(obj)
    }
}