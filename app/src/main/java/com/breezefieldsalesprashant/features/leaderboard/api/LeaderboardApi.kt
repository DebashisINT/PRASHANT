package com.breezefieldsalesprashant.features.leaderboard.api

import com.breezefieldsalesprashant.app.NetworkConstant
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.addshop.model.AddShopRequestData
import com.breezefieldsalesprashant.features.addshop.model.AddShopResponse
import com.breezefieldsalesprashant.features.addshop.model.LogFileResponse
import com.breezefieldsalesprashant.features.addshop.model.UpdateAddrReq
import com.breezefieldsalesprashant.features.contacts.CallHisDtls
import com.breezefieldsalesprashant.features.contacts.CompanyReqData
import com.breezefieldsalesprashant.features.contacts.ContactMasterRes
import com.breezefieldsalesprashant.features.contacts.SourceMasterRes
import com.breezefieldsalesprashant.features.contacts.StageMasterRes
import com.breezefieldsalesprashant.features.contacts.StatusMasterRes
import com.breezefieldsalesprashant.features.contacts.TypeMasterRes
import com.breezefieldsalesprashant.features.login.model.WhatsappApiData
import com.breezefieldsalesprashant.features.login.model.WhatsappApiFetchData
import io.reactivex.Observable
import okhttp3.MultipartBody
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*

/**
 * Created by Puja on 12-40-2014.
 */
interface LeaderboardApi {

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardBranchLists")
    fun branchList(@Field("session_token") session_token: String): Observable<LeaderboardBranchData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOwnList")
    fun ownDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOwnData>

    @FormUrlEncoded
    @POST("LeaderboardInfo/LeaderboardOverallList")
    fun overAllDatalist(@Field("user_id") user_id: String,@Field("activitybased") activitybased: String,@Field("branchwise") branchwise: String,@Field("flag") flag: String): Observable<LeaderboardOverAllData>


    /**
     * Companion object to create the GithubApiService
     */
    companion object Factory {
        fun create(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.ADD_SHOP_BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }

        fun createWithoutMultipart(): LeaderboardApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOut())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(LeaderboardApi::class.java)
        }
    }
}