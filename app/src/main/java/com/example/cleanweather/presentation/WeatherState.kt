package com.example.cleanweather.presentation

import com.example.cleanweather.domain.model.WeatherInfo

data class WeatherState(
    val isLoading: Boolean = false,
    val data: WeatherInfo? = null,
    val error: String? = null
)