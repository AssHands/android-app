package com.example.cleanweather.data.remote

import com.google.gson.annotations.SerializedName

data class WeatherDto(
    @SerializedName("name") val name: String,
    @SerializedName("main") val main: MainDto,
    @SerializedName("weather") val weather: List<WeatherDescriptionDto>,
    @SerializedName("wind") val wind: WindDto
)

data class MainDto(
    val temp: Double,
    val humidity: Int,
    @SerializedName("feels_like") val feelsLike: Double
)

data class WeatherDescriptionDto(
    val description: String
)

data class WindDto(
    val speed: Double
)