package com.marissaball.android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void leftClickFunction (View view) {
        Log.i("Info", "Left Button Tapped!");

    }

    public void rightClickFunction (View view) {
        Log.i("Info", "Right Button Tapped!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
