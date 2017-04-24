package com.example.android.quakereport;

import java.util.Date;

/**
 * Created by wasif on 01-04-2017.
 */
public class Earthquake {

    private double mMag;
    private String mLoc;
    private long mDate;
    private String mUrl;

    public Earthquake(double mag, String loc , long date, String url)
    {
        mMag = mag;
        mLoc = loc;
        mDate = date;
        mUrl = url;
    }

    public double getMagnitude()
    {
        return mMag;
    }

    public String getLocation()
    {
        return mLoc;
    }

    public long getDate()
    {
        return mDate;
    }

    public String getUrl()
    {
        return mUrl;
    }
}
