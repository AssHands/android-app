package com.example.cleanweather.data.repository

import com.example.cleanweather.data.mapper.toDomain
import com.example.cleanweather.data.remote.WeatherApi
import com.example.cleanweather.domain.repository.WeatherRepository
import com.example.cleanweather.domain.model.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    private val apiKey = "71f96b7a7ee062ed4cdcda9aaff417b4"

    override suspend fun getWeather(city: String): Result<WeatherInfo> {
        return try {
            val response = api.getWeather(city, apiKey)
            Result.success(response.toDomain())
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}