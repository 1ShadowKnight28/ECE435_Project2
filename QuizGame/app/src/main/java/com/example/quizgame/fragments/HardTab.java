package com.example.quizgame.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.quizgame.GeographyHard;
import com.example.quizgame.GeographyMedium;
import com.example.quizgame.HistoryHard;
import com.example.quizgame.HistoryMedium;
import com.example.quizgame.PopCultureHard;
import com.example.quizgame.PopCultureMedium;
import com.example.quizgame.R;
import com.example.quizgame.ScienceHard;
import com.example.quizgame.ScienceMedium;
import com.example.quizgame.StartPage;


public class HardTab extends Fragment {
    Button hard;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hard_tab, container, false);

        hard = view.findViewById(R.id.HardStartBtn);

        hard.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(StartPage.subject == "geo"){
                    Intent goToGeoHard = new Intent(getActivity(), GeographyHard.class);
                    startActivity(goToGeoHard);
                }else if (StartPage.subject == "history") {
                    Intent goToHistHard = new Intent(getActivity(), HistoryHard.class);
                    startActivity(goToHistHard);

                }else if (StartPage.subject == "science") {
                    Intent goToSciHard = new Intent(getActivity(), ScienceHard.class);
                    startActivity(goToSciHard);

                }else if (StartPage.subject == "pop") {
                    Intent goToPopHard = new Intent(getActivity(), PopCultureHard.class);
                    startActivity(goToPopHard);

                }

            }
        });

        return view;
    }
}