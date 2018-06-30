package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wangyue on 2018/6/24.
 */
public class Weather {
    public String status;

    public Basic basic;

    public Update update;

    public Now now;

    @SerializedName("lifestyle")
    //public Lifestyle lifestyle;
    public List<Lifestyle> lifestyleList;

    @SerializedName("daily_forecast")
    public List<Forest> forecastList;
}
