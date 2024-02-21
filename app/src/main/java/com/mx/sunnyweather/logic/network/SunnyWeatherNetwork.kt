package com.mx.sunnyweather.logic.network

import com.mx.sunnyweather.logic.service.PlaceService
import com.mx.sunnyweather.logic.service.WeatherService
import retrofit2.await
import retrofit2.create

/**
 * Created by 梦雪 on 2022/2/8 18:11.
 */
object SunnyWeatherNetwork {
    private val placeService = ServiceCreator.retrofit.create<PlaceService>()
    private val weatherService = ServiceCreator.retrofit.create<WeatherService>()

    suspend fun searchPlaces(query: String) = placeService.searchPlaces(query).await()

    suspend fun getDailyWeather(lng: String, lat: String) =
        weatherService.getDailyWeather(lng, lat).await()

    suspend fun getRealtimeWeather(lng: String, lat: String) =
        weatherService.getRealtimeWeather(lng, lat).await()

}