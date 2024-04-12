package com.example.quizgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GeographyMedium extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_medium);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;

        RadioButton GM1 = findViewById(R.id.GManswer1);
        RadioButton GM2 = findViewById(R.id.GManswer2);
        RadioButton GM3 = findViewById(R.id.GManswer3);
        RadioButton GM4 = findViewById(R.id.GManswer4);
        RadioButton GM5 = findViewById(R.id.GManswer5);


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (GM1.isChecked()) {
                    StartPage.points++;
                }
                if (GM2.isChecked()) {
                    StartPage.points++;
                }
                if (GM3.isChecked()) {
                    StartPage.points++;
                }
                if (GM4.isChecked()) {
                    StartPage.points++;
                }
                if (GM5.isChecked()) {
                    StartPage.points++;
                }

                Intent goToScore = new Intent(GeographyMedium.this, ScorePage.class);
                startActivity(goToScore);


            }
        });


    }
}