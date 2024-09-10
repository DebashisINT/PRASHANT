package com.breezefieldsalesprashant.features.photoReg.adapter

import com.breezefieldsalesprashant.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}