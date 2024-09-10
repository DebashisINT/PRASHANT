package com.breezefieldsalesprashant.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldsalesprashant.app.FileUtils
import com.breezefieldsalesprashant.app.Pref
import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.addshop.model.AddLogReqData
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
import com.breezefieldsalesprashant.features.dashboard.presentation.DashboardActivity
import com.breezefieldsalesprashant.features.login.model.WhatsappApiData
import com.breezefieldsalesprashant.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}