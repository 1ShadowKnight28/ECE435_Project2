package com.example.quizgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class StartPage extends AppCompatActivity {


    ImageButton geographyBtn, scienceBtn, popcultureBtn, historyBtn;
    public static String subject;
    public static int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);

        geographyBtn = findViewById(R.id.geographyBtn);
        scienceBtn = findViewById(R.id.scienceBtn);
        popcultureBtn = findViewById(R.id.popcultureBtn);
        historyBtn = findViewById(R.id.historyBtn);



        geographyBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                subject = "geo";
                Intent goToDifficulty = new Intent(StartPage.this, Difficulty.class);
                startActivity(goToDifficulty);

            }
        });
        scienceBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                subject = "science";
                Intent goToDifficulty = new Intent(StartPage.this, Difficulty.class);
                startActivity(goToDifficulty);

            }
        });

        popcultureBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                subject = "pop";
                Intent goToDifficulty = new Intent(StartPage.this, Difficulty.class);
                startActivity(goToDifficulty);

            }
        });

        historyBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                subject = "history";
                Intent goToDifficulty = new Intent(StartPage.this, Difficulty.class);
                startActivity(goToDifficulty);

            }
        });




    }
}