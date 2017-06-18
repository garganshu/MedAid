package com.dipakkr.github.bharathacks.model;

/**
 * Created by root on 6/18/17.
 */

public class UserInfo {
    public String placeid;
    public String latitude;
    public String longitude;

    public UserInfo(String placeid,String latitude, String longitude){
        this.placeid =placeid;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public UserInfo(){

    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPlaceid() {
        return placeid;
    }

    public void setPlaceid(String placeid) {
        this.placeid = placeid;
    }
}
