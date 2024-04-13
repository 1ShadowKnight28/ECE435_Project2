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

import com.example.quizgame.R;

public class HistoryEasy extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_easy);

        finish = findViewById(R.id.finishButton);
        StartPage.points = 0;
        RadioButton HE1 = findViewById(R.id.HEanswer1);
        RadioButton HE2 = findViewById(R.id.HEanswer2);
        RadioButton HE3 = findViewById(R.id.HEanswer3);
        RadioButton HE4 = findViewById(R.id.HEanswer4);
        RadioButton HE5 = findViewById(R.id.HEanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (HE1.isChecked()) {
                    StartPage.points++;
                }
                if (HE2.isChecked()) {
                    StartPage.points++;
                }
                if (HE3.isChecked()) {
                    StartPage.points++;
                }
                if (HE4.isChecked()) {
                    StartPage.points++;
                }
                if (HE5.isChecked()) {
                    StartPage.points++;
                }
                Intent goToScore = new Intent(HistoryEasy.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}