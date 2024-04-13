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

public class PopCultureEasy extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_culture_easy);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton PE1 = findViewById(R.id.PEanswer1);
        RadioButton PE2 = findViewById(R.id.PEanswer2);
        RadioButton PE3 = findViewById(R.id.PEanswer3);
        RadioButton PE4 = findViewById(R.id.PEanswer4);
        RadioButton PE5 = findViewById(R.id.PEanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (PE1.isChecked()) {
                    StartPage.points++;
                }
                if (PE2.isChecked()) {
                    StartPage.points++;
                }
                if (PE3.isChecked()) {
                    StartPage.points++;
                }
                if (PE4.isChecked()) {
                    StartPage.points++;
                }
                if (PE5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(PopCultureEasy.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}