package com.example.cleanweather.data.mapper

import com.example.cleanweather.data.remote.WeatherDto
import com.example.cleanweather.domain.model.WeatherInfo

fun WeatherDto.toDomain(): WeatherInfo {
    return WeatherInfo(
        cityName = name,
        temperature = main.temp,
        description = weather.firstOrNull()?.description ?: "",
        humidity = main.humidity,
        windSpeed = wind.speed,
        feelsLike = main.feelsLike
    )
}