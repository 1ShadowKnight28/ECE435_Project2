package com.example.quizgame;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ScorePage extends AppCompatActivity {

    EditText score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);
        StartPage.points = 8;

        score = findViewById(R.id.pointsBox);
        score.append(String.valueOf(StartPage.points));

    }
}