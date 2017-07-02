package com.example.android.ringwoodtourguide;

/**
 * Created by Simon on 08/06/2017.
 */

public class RingwoodConstructor {
    private int mPlaceName;
    private int mPlaceAddress;
    private int mPlaceImage;

    public RingwoodConstructor(int placeAddress, int placeDetail, int placeImage) {
        mPlaceAddress = placeDetail;
        mPlaceName = placeAddress;
        mPlaceImage = placeImage;
    }

    public int getPlaceName() {
        return mPlaceName;
    }

    public int getPlaceAddress() {
        return mPlaceAddress;
    }

    public int getPlaceImage() {
        return mPlaceImage;
    }
}
