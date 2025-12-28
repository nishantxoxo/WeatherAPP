package com.plcoding.weatherapp.domain.location

import android.location.Location

interface locationTracker {
    suspend fun getCurrentLocation(): Location?
}