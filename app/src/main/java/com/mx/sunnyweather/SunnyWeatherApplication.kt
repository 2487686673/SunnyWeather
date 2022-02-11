package com.mx.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * Created by 梦雪 on 2022/2/8 17:46.
 */
class SunnyWeatherApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
        const val TOKEN = "y8zaDzP8StVHMY1u"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}