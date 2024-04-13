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

public class GeographyHard extends AppCompatActivity {
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography_hard);

        finish = findViewById(R.id.finishButton);

        StartPage.points = 0;
        RadioButton GH1 = findViewById(R.id.GHanswer1);
        RadioButton GH2 = findViewById(R.id.GHanswer2);
        RadioButton GH3 = findViewById(R.id.GHanswer3);
        RadioButton GH4 = findViewById(R.id.GHanswer4);
        RadioButton GH5 = findViewById(R.id.GHanswer5);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (GH1.isChecked()) {
                    StartPage.points++;
                }
                if (GH2.isChecked()) {
                    StartPage.points++;
                }
                if (GH3.isChecked()) {
                    StartPage.points++;
                }
                if (GH4.isChecked()) {
                    StartPage.points++;
                }
                if (GH5.isChecked()) {
                    StartPage.points++;
                }

                Intent goToScore = new Intent(GeographyHard.this, ScorePage.class);
                startActivity(goToScore);
            }
        });

    }
}