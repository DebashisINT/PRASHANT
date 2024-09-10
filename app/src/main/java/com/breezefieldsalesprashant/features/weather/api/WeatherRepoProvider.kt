package com.breezefieldsalesprashant.features.weather.api

import com.breezefieldsalesprashant.features.task.api.TaskApi
import com.breezefieldsalesprashant.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}