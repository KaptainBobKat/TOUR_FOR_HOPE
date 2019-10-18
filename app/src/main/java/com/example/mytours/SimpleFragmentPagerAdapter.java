package com.example.mytours;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    private String[] tabTitles = new String[]{String.valueOf((R.string.Attraction)), String.valueOf((R.string.Resturants)), String.valueOf((R.string.hotels)), String.valueOf((R.string.shops))};
    private Context context;


    public SimpleFragmentPagerAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;

    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AttractionsFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new HotelsFragment();
        } else if (position == 3) {
            return new ShopsFragment();
        } else {
            return null;
        }


    }


    @Override
    public CharSequence getPageTitle(int position) {
        super.getPageTitle(position);
        return tabTitles[position];
    }
}


