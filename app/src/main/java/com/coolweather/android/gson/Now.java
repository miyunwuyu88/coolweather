package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangyue on 2018/6/24.
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond_txt")
    public String weather_cond;
}
