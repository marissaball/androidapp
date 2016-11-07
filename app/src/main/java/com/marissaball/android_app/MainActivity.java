package com.marissaball.android_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //Find the View that shows the symptoms category
        TextView symptoms = (TextView)findViewById(R.id.symptoms);

        TextView left = (TextView)findViewById(R.id.left);

        TextView right = (TextView)findViewById(R.id.right);

        TextView medication = (TextView)findViewById(R.id.medication);


        //Set a clickListener on that View
        symptoms.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link SymptomsActivity}
                Intent symptomsIntent = new Intent (MainActivity.this, SymptomsActivity.class);

                //Start the new activity
                startActivity(symptomsIntent);
            }

        });

        left.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link LeftEar}
                Intent leftIntent = new Intent(MainActivity.this, LeftEar.class);

                //Start the new activity
                startActivity(leftIntent);
            }
        });

        right.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link RightEar}
                Intent rightIntent = new Intent(MainActivity.this, RightEar.class);

                //Start the new activity
                startActivity(rightIntent);
            }
        });

        medication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                //Create a new intent to open the {@link MedicationActivity}
                Intent medicationIntent = new Intent(MainActivity.this, Medication.class);

                //Start the new activity
                startActivity(medicationIntent);
            }
        });
    }

//    public void leftClickFunction (View view){
//        Intent i = new Intent(this, LeftEar.class);
//        startActivity(i);
//    }
//
//    public void rightClickFunction (View view){
//        Intent i = new Intent(this, RightEar.class);
//        startActivity(i);
//    }

//    public void medicationClickFunction (View view){
//        Intent i = new Intent(this, Medication.class);
//        startActivity(i);
//    }


}
