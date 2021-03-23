package com.example.android.weatherforecast.retrofit;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface OpenWeatherApi {

    //One Call API https://openweathermap.org/api/one-call-api
    @GET("onecall")
    Call<OneCallRequest> getOneCallRequest(@QueryMap Map<String, String> parametersMap);
}
