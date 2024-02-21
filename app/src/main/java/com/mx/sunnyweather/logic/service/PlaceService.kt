package com.mx.sunnyweather.logic.service

import com.mx.sunnyweather.SunnyWeatherApplication
import com.mx.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by 梦雪 on 2022/2/8 18:03.
 */
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}