package com.example.mvdmvn.simpleweather.API.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Погода в данный момент
 */
public class CurrentWeather {

    private ForecastMain main;

    private ForecastWind wind;

    @SerializedName("name")
    private String cityName;


    public ForecastMain getMain() {
        return main;
    }

    public ForecastWind getWind() {
        return wind;
    }

    public String getCityName() {
        return cityName;
    }
}
