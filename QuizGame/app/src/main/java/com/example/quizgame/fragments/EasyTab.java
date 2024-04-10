package com.example.quizgame.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.quizgame.GeographyEasy;
import com.example.quizgame.HistoryEasy;
import com.example.quizgame.PopCultureEasy;
import com.example.quizgame.R;
import com.example.quizgame.ScienceEasy;
import com.example.quizgame.StartPage;

public class EasyTab extends Fragment {
    Button easy;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_easy_tab, container, false);
        easy = view.findViewById(R.id.EasyStartBtn);

        easy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(StartPage.subject == "geo"){
                    Intent goToGeoEasy = new Intent(getActivity(), GeographyEasy.class);
                    startActivity(goToGeoEasy);
                } else if (StartPage.subject == "history") {
                    Intent goToHistEasy = new Intent(getActivity(), HistoryEasy.class);
                    startActivity(goToHistEasy);

                }else if (StartPage.subject == "science") {
                    Intent goToSciEasy = new Intent(getActivity(), ScienceEasy.class);
                    startActivity(goToSciEasy);

                }else if (StartPage.subject == "pop") {
                    Intent goToPopEasy = new Intent(getActivity(), PopCultureEasy.class);
                    startActivity(goToPopEasy);

                }

            }
        });

        return view;
    }
}