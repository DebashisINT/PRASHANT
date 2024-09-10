package com.breezefieldsalesprashant.features.lead.api

import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.NewQuotation.model.AddQuotRequestData
import com.breezefieldsalesprashant.features.lead.model.*
import com.breezefieldsalesprashant.features.taskManagement.AddTaskReq
import com.breezefieldsalesprashant.features.taskManagement.EditTaskReq
import com.breezefieldsalesprashant.features.taskManagement.TaskViewRes
import com.breezefieldsalesprashant.features.taskManagement.model.TaskListReq
import io.reactivex.Observable

class GetLeadListRegRepository(val apiService : GetLeadListApi) {
    fun CustomerList(list: CustomerListReq): Observable<CustomerLeadResponse> {
        return apiService.getCustomerList(list)
    }

    fun submitActivity(list: AddActivityReq): Observable<BaseResponse> {
        return apiService.submitActivityListAPI(list)
    }

    fun editActivity(obj: EditActivityReq): Observable<BaseResponse> {
        return apiService.editActivityAPI(obj)
    }


    fun getActivityList(crm_id: String): Observable<ActivityViewRes> {
        return apiService.viewActivityList(crm_id)
    }

    fun TaskList(list: TaskListReq): Observable<TaskResponse> {
        return apiService.getTaskList(list)
    }

    fun submitTask(list: AddTaskReq): Observable<BaseResponse> {
        return apiService.submitTaskListAPI(list)
    }

    fun getTaskList(task_id: String): Observable<TaskViewRes> {
        return apiService.viewTaskList(task_id)
    }

    fun editTask(obj: EditTaskReq): Observable<BaseResponse> {
        return apiService.editTaskAPI(obj)
    }

}