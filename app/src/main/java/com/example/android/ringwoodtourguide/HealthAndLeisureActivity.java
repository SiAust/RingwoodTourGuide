package com.example.android.ringwoodtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Simon on 07/06/2017.
 */

public class HealthAndLeisureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sport_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new HealthAndLeisureFragment())
                .commit();
    }
}
