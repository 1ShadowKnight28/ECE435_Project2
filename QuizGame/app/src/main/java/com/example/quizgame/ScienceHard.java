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

public class ScienceHard extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_hard);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton SH1 = findViewById(R.id.SHanswer1);
        RadioButton SH2 = findViewById(R.id.SHanswer2);
        RadioButton SH3 = findViewById(R.id.SHanswer3);
        RadioButton SH4 = findViewById(R.id.SHanswer4);
        RadioButton SH5 = findViewById(R.id.SHanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (SH1.isChecked()) {
                    StartPage.points++;
                }
                if (SH2.isChecked()) {
                    StartPage.points++;
                }
                if (SH3.isChecked()) {
                    StartPage.points++;
                }
                if (SH4.isChecked()) {
                    StartPage.points++;
                }
                if (SH5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(ScienceHard.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}