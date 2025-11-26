package com.example.cleanweather.domain.repository

import com.example.cleanweather.domain.model.WeatherInfo

interface WeatherRepository {
    suspend fun getWeather(city: String): Result<WeatherInfo>
}