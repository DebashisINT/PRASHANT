package com.breezefieldsalesprashant.features.newcollectionreport

import com.breezefieldsalesprashant.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}