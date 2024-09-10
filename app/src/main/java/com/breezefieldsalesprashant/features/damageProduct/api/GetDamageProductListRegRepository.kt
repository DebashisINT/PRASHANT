package com.breezefieldsalesprashant.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldsalesprashant.app.FileUtils
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.NewQuotation.model.*
import com.breezefieldsalesprashant.features.addshop.model.AddShopRequestData
import com.breezefieldsalesprashant.features.addshop.model.AddShopResponse
import com.breezefieldsalesprashant.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldsalesprashant.features.damageProduct.model.delBreakageReq
import com.breezefieldsalesprashant.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldsalesprashant.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldsalesprashant.features.myjobs.model.WIPImageSubmit
import com.breezefieldsalesprashant.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}