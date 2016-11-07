package com.marissaball.android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SymptomsActivity extends AppCompatActivity {

    public void symptomsClickFunction (View view){
        Toast.makeText(view.getContext(), "Open Symptoms Chart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
    }

}
