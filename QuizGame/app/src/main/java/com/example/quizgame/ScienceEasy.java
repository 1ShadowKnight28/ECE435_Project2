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

public class ScienceEasy extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_easy);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton SE1 = findViewById(R.id.SEanswer1);
        RadioButton SE2 = findViewById(R.id.SEanswer2);
        RadioButton SE3 = findViewById(R.id.SEanswer3);
        RadioButton SE4 = findViewById(R.id.SEanswer4);
        RadioButton SE5 = findViewById(R.id.SEanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (SE1.isChecked()) {
                    StartPage.points++;
                }
                if (SE2.isChecked()) {
                    StartPage.points++;
                }
                if (SE3.isChecked()) {
                    StartPage.points++;
                }
                if (SE4.isChecked()) {
                    StartPage.points++;
                }
                if (SE5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(ScienceEasy.this, ScorePage.class);
                startActivity(goToScore);


            }
        });

    }
}