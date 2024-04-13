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

public class ScienceMedium extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_medium);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton SM1 = findViewById(R.id.SManswer1);
        RadioButton SM2 = findViewById(R.id.SManswer2);
        RadioButton SM3 = findViewById(R.id.SManswer3);
        RadioButton SM4 = findViewById(R.id.SManswer4);
        RadioButton SM5 = findViewById(R.id.SManswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (SM1.isChecked()) {
                    StartPage.points++;
                }
                if (SM2.isChecked()) {
                    StartPage.points++;
                }
                if (SM3.isChecked()) {
                    StartPage.points++;
                }
                if (SM4.isChecked()) {
                    StartPage.points++;
                }
                if (SM5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(ScienceMedium.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}