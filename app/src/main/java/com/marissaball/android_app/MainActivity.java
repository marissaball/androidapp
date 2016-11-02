package com.marissaball.android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void leftClickFunction (View view){
        Intent i = new Intent(this, LeftEar.class);
        startActivity(i);
    }

    public void rightClickFunction (View view){
        Intent i = new Intent(this, RightEar.class);
        startActivity(i);
    }

    public void medicationClickFunction (View view){
        Intent i = new Intent(this, Medication.class);
        startActivity(i);
    }
}
