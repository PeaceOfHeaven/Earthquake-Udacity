package com.example.android.quakereport;

/**
 * Created by Nhat on 5/30/2017.
 */

public class Earthquake {

  private float mMagnitude;
  private String mPlace;
  private String mTime;

  public Earthquake(float magnitude, String place, String time) {
    mMagnitude = magnitude;
    mPlace = place;
    mTime = time;
  }

  public float getMagnitude() {
    return mMagnitude;
  }

  public String getPlace() {
    return mPlace;
  }

  public String getTime() {
    return mTime;
  }
}
