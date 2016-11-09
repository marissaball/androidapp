package com.marissaball.android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SymptomsActivity extends AppCompatActivity {

    public void symptomsClickFunction (View view){
        Toast.makeText(view.getContext(), "Open Symptoms Chart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        //Create an array of words
        ArrayList<String> symptoms = new ArrayList<String>();

        symptoms.add("Dizziness");
        symptoms.add("Nausea");
        symptoms.add("Pressure");
        symptoms.add("Light Sensitivity");
        symptoms.add("Shaky Hands");
        symptoms.add("Shallow Breaths");
        symptoms.add("Tinnitus");


        //Find the root view of the whole layout
        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        for(int index = 0; index < symptoms.size(); index++){
            //Create a new TextView
            TextView symptomView = new TextView(this);

            //Set the text to be symptom at the current index
            symptomView.setText(symptoms.get(index));

            //Add this TextView as another child to the root view of this layout
            rootView.addView(symptomView);
        }
    }
}