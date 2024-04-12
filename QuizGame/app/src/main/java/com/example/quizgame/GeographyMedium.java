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

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToScore = new Intent(GeographyMedium.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

        RadioButton answer1 = findViewById(R.id.answer1);
        RadioButton answer2 = findViewById(R.id.answer2);
        RadioButton answer3 = findViewById(R.id.answer3);
        RadioButton answer4 = findViewById(R.id.answer4);
        RadioButton answer5 = findViewById(R.id.answer5);


        if (answer1.isChecked()) {
            StartPage.points++;
        }
        if (answer2.isChecked()) {
            StartPage.points++;
        }
        if (answer3.isChecked()) {
            StartPage.points++;
        }
        if (answer4.isChecked()) {
            StartPage.points++;
        }
        if (answer5.isChecked()) {
            StartPage.points++;
        }


    }
}