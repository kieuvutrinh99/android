package com.example.kieuvutrinh_appbtl.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.kieuvutrinh_appbtl.Fragment.FoodFragment;
import com.example.kieuvutrinh_appbtl.Fragment.HeartFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new FoodFragment();
            case 1:return new HeartFragment();
            default:return new FoodFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
