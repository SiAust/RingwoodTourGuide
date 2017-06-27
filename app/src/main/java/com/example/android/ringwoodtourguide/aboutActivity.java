package com.example.android.ringwoodtourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Simon on 17/06/2017.
 */

public class aboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        ImageView emailButton = (ImageView) findViewById(R.id.emailButton);
        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:simon.aust@googlemail.com")); // only email apps should handle this
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Ringwood Tour Guide App");
                if (emailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(emailIntent);
                }
            }
        });

        ImageView udacityButton = (ImageView) findViewById(R.id.udacityButton);
        udacityButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent udacityIntent = new Intent(Intent.ACTION_VIEW);
                udacityIntent.setData(Uri.parse("http://www.udacity.com"));
                startActivity(udacityIntent);
            }
        });
    }
}
