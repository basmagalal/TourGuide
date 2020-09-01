package com.example.tourguidapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

@SuppressWarnings("deprecation")
class CitiesAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public CitiesAdapter(Context context, FragmentManager fm) {
      super(fm);
        mContext = context;
    }

@NonNull
@Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new CairoFragment();
            case 1:
                return new MatrouhFragment();
            case 2:
                return new AlexFragment();

            default:
                return new Fragment();
        }}

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.cairo_city);
            case 1:
                return mContext.getString(R.string.alex_city);
            case 2:
                return mContext.getString(R.string.matroh_city);

            default:
                return null;
        }
    }


    public int getCount() {
        return 3;
    }




}


