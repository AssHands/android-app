package com.example.cleanweather.domain.model

data class WeatherInfo(
    val cityName: String,
    val temperature: Double,
    val description: String,
    val humidity: Int,
    val windSpeed: Double,
    val feelsLike: Double
)