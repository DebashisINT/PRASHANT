package com.breezefieldsalesprashant.features.stockCompetetorStock.api

import com.breezefieldsalesprashant.app.NetworkConstant
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesprashant.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldsalesprashant.features.stockAddCurrentStock.api.ShopAddStockApi
import com.breezefieldsalesprashant.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesprashant.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AddCompStockApi {

    @POST("CompetitorStock/AddCompetitorStock")
    fun submShopCompStock(@Body shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest?): Observable<BaseResponse>

    @FormUrlEncoded
    @POST("CompetitorStock/CompetitorStockList")
    fun getCompStockList(@Field("session_token") session_token: String, @Field("user_id") user_id: String, @Field("date") date: String):
            Observable<CompetetorStockGetData>

    companion object Factory {
        fun create(): AddCompStockApi {
            val retrofit = Retrofit.Builder()
                    .client(NetworkConstant.setTimeOutNoRetry())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(NetworkConstant.BASE_URL)
                    .build()

            return retrofit.create(AddCompStockApi::class.java)
        }
    }

}