package com.breezefieldsalesprashant.features.stockCompetetorStock.api

import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.orderList.model.NewOrderListResponseModel
import com.breezefieldsalesprashant.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldsalesprashant.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}