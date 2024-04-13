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

public class HistoryHard extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_hard);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton HH1 = findViewById(R.id.HHanswer1);
        RadioButton HH2 = findViewById(R.id.HHanswer2);
        RadioButton HH3 = findViewById(R.id.HHanswer3);
        RadioButton HH4 = findViewById(R.id.HHanswer4);
        RadioButton HH5 = findViewById(R.id.HHanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (HH1.isChecked()) {
                    StartPage.points++;
                }
                if (HH2.isChecked()) {
                    StartPage.points++;
                }
                if (HH3.isChecked()) {
                    StartPage.points++;
                }
                if (HH4.isChecked()) {
                    StartPage.points++;
                }
                if (HH5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(HistoryHard.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}