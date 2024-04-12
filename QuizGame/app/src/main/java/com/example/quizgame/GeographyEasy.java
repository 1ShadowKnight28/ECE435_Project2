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

public class GeographyEasy extends AppCompatActivity {

    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_easy);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;

        RadioButton GE1 = findViewById(R.id.GEanswer1);
        RadioButton GE2 = findViewById(R.id.GEanswer2);
        RadioButton GE3 = findViewById(R.id.GEanswer3);
        RadioButton GE4 = findViewById(R.id.GEanswer4);
        RadioButton GE5 = findViewById(R.id.GEanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (GE1.isChecked()) {
                    StartPage.points++;
                }
                if (GE2.isChecked()) {
                    StartPage.points++;
                }
                if (GE3.isChecked()) {
                    StartPage.points++;
                }
                if (GE4.isChecked()) {
                    StartPage.points++;
                }
                if (GE5.isChecked()) {
                    StartPage.points++;
                }


                Intent goToScore = new Intent(GeographyEasy.this, ScorePage.class);
                startActivity(goToScore);
            }
        });










    }
}