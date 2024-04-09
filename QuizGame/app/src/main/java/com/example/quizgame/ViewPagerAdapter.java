package com.example.quizgame;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.quizgame.fragments.EasyTab;
import com.example.quizgame.fragments.HardTab;
import com.example.quizgame.fragments.MediumTab;

public class ViewPagerAdapter extends FragmentStateAdapter {
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0: return new EasyTab();
            case 1: return new MediumTab();
            case 2: return new HardTab();
            default: return new EasyTab();

        }
    }

    @Override
    public int getItemCount() {

        return 3;
    }
}
