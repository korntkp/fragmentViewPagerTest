package com.zackoji.fragmentviewpagertest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Zackoji on 29/6/2558.
 */
public class MyPageAdapter extends FragmentPagerAdapter {

    private final int PAGE_NUM = 3;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return Number of Fragment
     * This Project has 3 Fragment (PAGE_NUM)
     * */
    @Override
    public int getCount() {
        return PAGE_NUM;
    }

    /**
     * position -> Order of Fragment in View Pager
     * */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new OneFragment();
        else if (position == 1) return new TwoFragment();
        else if (position == 2) return new ThreeFragment();
        return null;
    }
}
