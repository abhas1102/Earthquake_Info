package com.example.android.quakereport;

/**
 * Created by Abhas on 25-09-2017.
 */

public class Earthquake {


    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;

    }




    public String getLocation(){return mLocation;}
    public double getMagnitude(){return mMagnitude;}
    public String getDate(){return mDate;}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {return mUrl;}


}
