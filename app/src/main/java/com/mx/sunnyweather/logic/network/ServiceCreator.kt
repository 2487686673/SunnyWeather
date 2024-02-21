package com.mx.sunnyweather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by 梦雪 on 2022/2/8 18:06.
 */
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}