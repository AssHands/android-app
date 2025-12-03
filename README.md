# CleanWeather

Простое Android-приложение для просмотра текущей погоды и прогноза.  
Проект создан с использованием **Kotlin**, **Jetpack Compose** и современных Android-технологий.

## Возможности
- отображение текущей погоды;
- прогноз на ближайшие дни;
- загрузка данных из сети;
- удобный и минималистичный интерфейс.

## Использованные технологии
- **Kotlin**
- **Jetpack Compose**
- **Coroutines / Flow**
- **Retrofit / OkHttp**
- **Material Design 3**
- **Gradle Kotlin DSL**

## Запуск проекта
1. Склонируйте репозиторий:
   ```bash
   git clone https://github.com/AssHands/android-app.git

2. Получите API ключ на сайте https://api.openweathermap.org/ 

3. Перейдите в класс com.example.cleanweather.data.repository.WeatherRepositoryImpl 

4. Вставтьте свой API ключ в переменную "apiKey"