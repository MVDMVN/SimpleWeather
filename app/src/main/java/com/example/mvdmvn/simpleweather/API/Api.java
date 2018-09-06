package com.example.mvdmvn.simpleweather.API;

import com.example.mvdmvn.simpleweather.API.Models.CurrentWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * API Interface
 */
public interface Api {

    @GET("weather")
    Call<CurrentWeather> getCurrentWeather(
            @Query("lat") float latitude,
            @Query("lon") float longitude,

            @Query("appid") String apiKey,
            @Query("units") String units
    );

}
