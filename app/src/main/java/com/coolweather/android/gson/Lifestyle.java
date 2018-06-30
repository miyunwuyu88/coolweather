package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wangyue on 2018/6/24.
 */
public class Lifestyle {

    @SerializedName("brf")
    public String comfort;

    @SerializedName("txt")
    public String suggest;

    public String type;
}
