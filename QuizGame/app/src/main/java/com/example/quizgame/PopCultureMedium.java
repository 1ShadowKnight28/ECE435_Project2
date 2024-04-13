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

public class PopCultureMedium extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_culture_medium);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton PM1 = findViewById(R.id.PManswer1);
        RadioButton PM2 = findViewById(R.id.PManswer2);
        RadioButton PM3 = findViewById(R.id.PManswer3);
        RadioButton PM4 = findViewById(R.id.PManswer4);
        RadioButton PM5 = findViewById(R.id.PManswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (PM1.isChecked()) {
                    StartPage.points++;
                }
                if (PM2.isChecked()) {
                    StartPage.points++;
                }
                if (PM3.isChecked()) {
                    StartPage.points++;
                }
                if (PM4.isChecked()) {
                    StartPage.points++;
                }
                if (PM5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(PopCultureMedium.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}