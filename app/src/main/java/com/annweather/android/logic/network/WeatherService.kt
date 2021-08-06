package com.annweather.android.logic.network
import retrofit2.Call
//import android.telecom.Call
import com.annweather.android.AnnWeatherApplication
import com.annweather.android.logic.model.RealtimeResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${AnnWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>
}