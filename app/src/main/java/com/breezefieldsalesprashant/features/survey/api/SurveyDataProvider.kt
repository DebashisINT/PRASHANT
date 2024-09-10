package com.breezefieldsalesprashant.features.survey.api

import com.breezefieldsalesprashant.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldsalesprashant.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}