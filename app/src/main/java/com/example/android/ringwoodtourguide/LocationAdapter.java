package com.example.android.ringwoodtourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Simon on 08/06/2017.
 */

public class LocationAdapter extends ArrayAdapter<RingwoodConstructor> {

    private static final String LOG_TAG = LocationAdapter.class.getSimpleName();

    public LocationAdapter(Activity context, ArrayList<RingwoodConstructor> rwood, int colorResourceId) {
        super(context, 0, rwood);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rwoodList = convertView;
        if (rwoodList == null) {
            rwoodList = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

        RingwoodConstructor placeList = getItem(position);

            TextView placeDetail = (TextView) rwoodList.findViewById(R.id.place_details);
            placeDetail.setText(placeList.getPlaceAddress());

            TextView placeTitle = (TextView) rwoodList.findViewById(R.id.place_address);
            placeTitle.setText(placeList.getPlaceName());

            ImageView placeImage = (ImageView) rwoodList.findViewById(R.id.ringwood_image_view);
            placeImage.setBackgroundResource(placeList.getPlaceImage());
        }

        return rwoodList;
    }
}
