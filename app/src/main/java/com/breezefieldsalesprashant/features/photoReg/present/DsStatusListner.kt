package com.breezefieldsalesprashant.features.photoReg.present

import com.breezefieldsalesprashant.app.domain.ProspectEntity
import com.breezefieldsalesprashant.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}