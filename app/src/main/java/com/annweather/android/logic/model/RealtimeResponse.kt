
package com.annweather.android.logic.model

    data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    //data class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    // class AirQuality(val aqi: AQI)

    // class AQI(val chn: Float)
    data class Realtime(val skycon: String, val temperature: Float, val wind: Wind)

    data class Wind(val speed: Float, val direction: Float)
    //"wind":{"speed":24.12,"direction":90.0}

}