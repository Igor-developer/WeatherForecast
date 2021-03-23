package com.example.android.weatherforecast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.android.weatherforecast.retrofit.OneCallRequest;
import com.example.android.weatherforecast.retrofit.OpenWeatherApi;
import com.example.android.weatherforecast.retrofit.RetrofitSingleton;

import java.util.LinkedHashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
//Занятие 12.
//Создать приложение на основе API.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Переменная для хранения вывода данных
        StringBuilder out = new StringBuilder();

        //TextView для отображения текста
        TextView info = findViewById(R.id.info);

        //Получение реализации интерфейса для работы с сервером
        OpenWeatherApi openWeatherApi = RetrofitSingleton.getInstance().getOpenWeatherApi();

        //Создание параметров запроса
        Map<String, String> parametersMap = new LinkedHashMap<>();
        parametersMap.put("lat", "50.4536");                            //широта
        parametersMap.put("lon", "30.5164");                            //долгота
        parametersMap.put("appid", "my_key"); //ключ API
        parametersMap.put("units", "metric");                           //единицы измерения
        parametersMap.put("lang", "ru");                                //язык

        //Вывод строки запроса в Logcat
        Log.d("request", createRequest(parametersMap));

        //Осуществление запроса в многопоточном режиме
        openWeatherApi.getOneCallRequest(parametersMap).enqueue(new Callback<OneCallRequest>() {
            @Override
            public void onResponse(Call<OneCallRequest> call, Response<OneCallRequest> response) {
                if (response.isSuccessful()) {
                    out.append(getForecast(response.body()));
                } else {
                    out.append("Запрос осуществлён, однако получена ошибка - ")
                            .append(response.code())
                            .append(".")
                            .append(System.lineSeparator());
                }

                info.setText(out);
            }

            @Override
            public void onFailure(Call<OneCallRequest> call, Throwable t) {
                out.append("Не удалось осуществить запрос или парсинг данных.")
                        .append(System.lineSeparator())
                        .append("Смотрите Logcat.")
                        .append(System.lineSeparator());
                Log.e(null, null, t);

                info.setText(out);
            }
        });

    }

    //Вывод строки запроса
    private String createRequest(Map<String, String> parametersMap) {

        StringBuilder request = new StringBuilder();
        request.append(RetrofitSingleton.BASE_URL).append("onecall?");
        parametersMap.forEach((s1, s2) -> request.append(s1).append("=").append(s2).append("&"));
        request.deleteCharAt(request.length() - 1);

        return request.toString();
    }

    //Вывод погодных данных из запроса
    private StringBuilder getForecast(OneCallRequest body) {

        StringBuilder forecast = new StringBuilder();
        forecast.append("Широта ")
                .append(body.getLatitude())
                .append(";")
                .append(" долгота ")
                .append(body.getLongitude())
                .append(".")
                .append(System.lineSeparator())
                .append(System.lineSeparator());

        forecast.append("Текущая температура ")
                .append(body.getCurrent().getTemperature())
                .append(" °C.")
                .append(System.lineSeparator())
                .append(System.lineSeparator());

        forecast.append("Температура завтра днём ")
                .append(body.getDaily()[1].getTemperature().getDayTemp())
                .append(" °C.")
                .append(System.lineSeparator())
                .append(System.lineSeparator());

        return forecast;
    }
}