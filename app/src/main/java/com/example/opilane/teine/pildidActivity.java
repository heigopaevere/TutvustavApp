package com.example.opilane.teine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class pildidActivity extends AppCompatActivity {

    ImageView tallinn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pildid);
        tallinn=(ImageView)findViewById(R.id.tallinn);

    }

    public void tagasi(View view) {
            Intent intent = new Intent( pildidActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }

