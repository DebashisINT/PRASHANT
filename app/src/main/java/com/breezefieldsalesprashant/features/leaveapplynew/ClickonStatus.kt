package com.breezefieldsalesprashant.features.leaveapplynew

import com.breezefieldsalesprashant.features.addAttendence.model.Leave_list_Response


interface ClickonStatus {
    fun OnApprovedclick(obj: Leave_list_Response)
    fun OnRejectclick(obj: Leave_list_Response)
}