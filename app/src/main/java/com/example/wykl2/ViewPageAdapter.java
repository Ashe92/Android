package com.example.wykl2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by kdyndul on 2015-11-23.
 */
public class ViewPageAdapter extends FragmentStatePagerAdapter {
    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ExampleFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}
