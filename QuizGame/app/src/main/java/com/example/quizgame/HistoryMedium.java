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

public class HistoryMedium extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_medium);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton HM1 = findViewById(R.id.HManswer1);
        RadioButton HM2 = findViewById(R.id.HManswer2);
        RadioButton HM3 = findViewById(R.id.HManswer3);
        RadioButton HM4 = findViewById(R.id.HManswer4);
        RadioButton HM5 = findViewById(R.id.HManswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (HM1.isChecked()) {
                    StartPage.points++;
                }
                if (HM2.isChecked()) {
                    StartPage.points++;
                }
                if (HM3.isChecked()) {
                    StartPage.points++;
                }
                if (HM4.isChecked()) {
                    StartPage.points++;
                }
                if (HM5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(HistoryMedium.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}