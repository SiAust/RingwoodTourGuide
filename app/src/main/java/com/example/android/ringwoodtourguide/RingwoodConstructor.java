package com.example.android.ringwoodtourguide;

/**
 * Created by Simon on 08/06/2017.
 */

public class RingwoodConstructor {
    private String mPlaceAddress;
    private int mPlaceDetail;
    private int mPlaceImage;

    public RingwoodConstructor(String placeAddress, int placeDetail, int placeImage) {
        mPlaceDetail = placeDetail;
        mPlaceAddress = placeAddress;
        mPlaceImage = placeImage;
    }

    public String getPlaceAddress() {
        return mPlaceAddress;
    }

    public int getPlaceDetail() {
        return mPlaceDetail;
    }

    public int getPlaceImage() {
        return mPlaceImage;
    }
}
