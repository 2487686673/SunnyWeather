package com.mx.sunnyweather.logic.service

import com.mx.sunnyweather.SunnyWeatherApplication
import com.mx.sunnyweather.logic.model.DailyResponse
import com.mx.sunnyweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by 梦雪 on 2024/2/20 20:39.
 */
interface WeatherService {
    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}