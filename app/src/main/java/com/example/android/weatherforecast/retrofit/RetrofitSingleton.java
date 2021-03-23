package com.example.android.weatherforecast.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitSingleton {

    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/";
    OpenWeatherApi openWeatherApi;

    private static RetrofitSingleton retrofitSingleton;

    private RetrofitSingleton() {
    }

    public static RetrofitSingleton getInstance() {
        if (retrofitSingleton == null) {
            retrofitSingleton = new RetrofitSingleton();
        }

        return retrofitSingleton;
    }

    public OpenWeatherApi getOpenWeatherApi() {
        if (openWeatherApi == null) {
            openWeatherApi = createRetrofit(BASE_URL).create(OpenWeatherApi.class);
        }

        return openWeatherApi;
    }

    private Retrofit createRetrofit(String url) {

        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
