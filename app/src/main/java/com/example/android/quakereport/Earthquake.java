package com.example.android.quakereport;

/**
 * Created by Abhas on 25-09-2017.
 */

public class Earthquake {


    private double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;


    public Earthquake(double magnitude, String location , long timeInMilliseconds){

        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;

    }




    public String getLocation(){return mLocation;}
    public double getMagnitude(){return mMagnitude;}
    public String getDate(){return mDate;}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
