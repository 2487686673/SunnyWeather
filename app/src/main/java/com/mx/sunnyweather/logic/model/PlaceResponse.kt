package com.mx.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Created by 梦雪 on 2022/2/8 17:58.
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)