package com.example.tourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AlexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new AlexFragment());
    }
}
