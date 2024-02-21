package com.mx.sunnyweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.mx.sunnyweather.logic.model.Place

/**
 * Created by 梦雪 on 2024/2/20 23:49.
 */
object PlaceDao {
    fun savePlace(context: Context, place: Place) {
        sharedPreferences(context).edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(context: Context): Place {
        val placeJson = sharedPreferences(context).getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved(context: Context): Boolean = sharedPreferences(context).contains("place")

    private fun sharedPreferences(context: Context) =
        context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}