package com.breezefieldsalesprashant.features.location.api

import com.breezefieldsalesprashant.app.Pref
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.location.model.AppInfoInputModel
import com.breezefieldsalesprashant.features.location.model.AppInfoResponseModel
import com.breezefieldsalesprashant.features.location.model.GpsNetInputModel
import com.breezefieldsalesprashant.features.location.model.ShopDurationRequest
import com.breezefieldsalesprashant.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}