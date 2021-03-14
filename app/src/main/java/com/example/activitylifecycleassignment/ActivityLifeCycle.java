package com.example.activitylifecycleassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constraint_layout);
    }
}