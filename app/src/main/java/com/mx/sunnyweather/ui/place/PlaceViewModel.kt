package com.mx.sunnyweather.ui.place

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.switchMap
import com.mx.sunnyweather.logic.model.Place
import com.mx.sunnyweather.logic.repository.Repository

/**
 * Created by 梦雪 on 2022/2/11 13:52.
 */
class PlaceViewModel : ViewModel() {
    val placeList = ArrayList<Place>()
    private val searchLiveData = MutableLiveData<String>()
    val placeLiveData = searchLiveData.switchMap { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(context: Context, place: Place) = Repository.savePlace(context, place)

    fun getSavedPlace(context: Context): Place = Repository.getSavedPlace(context)

    fun isPlaceSaved(context: Context): Boolean = Repository.isPlaceSaved(context)
}