package com.breezefieldsalesprashant.features.activities.api

import com.breezefieldsalesprashant.features.member.api.TeamApi
import com.breezefieldsalesprashant.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}