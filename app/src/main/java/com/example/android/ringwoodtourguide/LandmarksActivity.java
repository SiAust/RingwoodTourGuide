package com.example.android.ringwoodtourguide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Simon on 29/06/2017.
 */

public class LandmarksActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sport_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new LandmarkActivityFragment())
                .commit();
    }
}
