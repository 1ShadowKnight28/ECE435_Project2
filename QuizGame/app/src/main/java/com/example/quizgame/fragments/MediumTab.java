package com.example.quizgame.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.quizgame.GeographyMedium;
import com.example.quizgame.HistoryMedium;
import com.example.quizgame.PopCultureMedium;
import com.example.quizgame.R;
import com.example.quizgame.ScienceMedium;
import com.example.quizgame.StartPage;

public class MediumTab extends Fragment {
    Button medium;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_medium_tab, container, false);

        medium = view.findViewById(R.id.MediumStartBtn);

        medium.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(StartPage.subject == "geo"){
                    Intent goToGeoMed = new Intent(getActivity(), GeographyMedium.class);
                    startActivity(goToGeoMed);
                }else if (StartPage.subject == "history") {
                    Intent goToHistMed = new Intent(getActivity(), HistoryMedium.class);
                    startActivity(goToHistMed);

                }else if (StartPage.subject == "science") {
                    Intent goToSciMed = new Intent(getActivity(), ScienceMedium.class);
                    startActivity(goToSciMed);

                }else if (StartPage.subject == "pop") {
                    Intent goToPopMed = new Intent(getActivity(), PopCultureMedium.class);
                    startActivity(goToPopMed);

                }

            }
        });

        return view;
    }
}