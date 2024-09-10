package com.breezefieldsalesprashant.features.weather.api

import com.breezefieldsalesprashant.base.BaseResponse
import com.breezefieldsalesprashant.features.task.api.TaskApi
import com.breezefieldsalesprashant.features.task.model.AddTaskInputModel
import com.breezefieldsalesprashant.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesprashant.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}