package com.example.android.quakereport;

/**
 * Created by Abhas on 25-09-2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public Earthquake(String magnitude, String location , String date){

        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;

    }

    public String getLocation(){return mLocation;}
    public String getMagnitude(){return mMagnitude;}
    public String getDate(){return mDate;}
}
