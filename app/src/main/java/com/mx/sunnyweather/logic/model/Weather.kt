package com.mx.sunnyweather.logic.model

/**
 * Created by 梦雪 on 2024/2/20 20:31.
 */
data class Weather(
    val realtime: RealtimeResponse.Realtime,
    val daily: DailyResponse.Daily
)
