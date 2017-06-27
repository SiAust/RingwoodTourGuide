package com.example.android.ringwoodtourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Simon on 08/06/2017.
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set content of the activity to use the activity_main.xml layout file.
        setContentView(R.layout.activity_main);

        //Find the view associated with the Sport category and set a click listener on that view.
        //Create an intent to open the SportCategoryActivity.
        TextView textView = (TextView)findViewById(R.id.category_menu_sport);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sportIntent = new Intent(MainActivity.this, SportCategoryActivity.class);
                startActivity(sportIntent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent aboutIntent = new Intent(this, aboutActivity.class);
            startActivity(aboutIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}
