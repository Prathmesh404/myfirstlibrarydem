package com.example.utils;

import android.location.Location;

public class MyFirstLibrary {
    public static float getLocation(double startlon,double startlat,double endlon,double endlat){
        float[] results=new float[0];
        Location.distanceBetween(startlat,startlon,endlat,endlon,results);
        return results[0]/1000;
    }
}
