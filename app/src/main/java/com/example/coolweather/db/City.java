package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

public class City extends LitePalSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProcinceId() {
        return provinceId;
    }

    public void setProcinceId(int procinceId) {
        this.provinceId = procinceId;
    }
}
