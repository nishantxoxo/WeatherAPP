package com.plcoding.weatherapp.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {
    @GET("v1/forecast?hourly=temperature_2m,relative_humidity_2m,weathercode,windspeed_10m,pressure_msl")
    suspend fun getWeatherData( @Query("latitute") lat: Double,
                                @Query("longitute") long: Double,
                                ) : WeatherDto
}