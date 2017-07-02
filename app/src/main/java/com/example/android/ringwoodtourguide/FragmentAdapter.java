package com.example.android.ringwoodtourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Simon on 07/06/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ShoppingActivityFragment();
        } if (position == 1) {
            return new DiningActivityFragment();
        } if (position == 2) {
            return new LandmarkActivityFragment();
        } else {
            return new SportActivityFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_menu_shops);
        } if (position == 1) {
            return  mContext.getString(R.string.category_menu_food);
        } if (position == 2) {
            return mContext.getString(R.string.category_menu_landmarks);
        } else {
            return mContext.getString(R.string.category_menu_sport);
        }
    }
}
