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

public class PopCultureHard extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_culture_hard);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton PH1 = findViewById(R.id.PHanswer1);
        RadioButton PH2 = findViewById(R.id.PHanswer2);
        RadioButton PH3 = findViewById(R.id.PHanswer3);
        RadioButton PH4 = findViewById(R.id.PHanswer4);
        RadioButton PH5 = findViewById(R.id.PHanswer5);


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PH1.isChecked()) {
                    StartPage.points++;
                }
                if (PH2.isChecked()) {
                    StartPage.points++;
                }
                if (PH3.isChecked()) {
                    StartPage.points++;
                }
                if (PH4.isChecked()) {
                    StartPage.points++;
                }
                if (PH5.isChecked()) {
                    StartPage.points++;
                }

                Intent goToScore = new Intent(PopCultureHard.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}