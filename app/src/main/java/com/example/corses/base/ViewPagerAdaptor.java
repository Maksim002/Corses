package com.example.corses.base;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdaptor extends FragmentPagerAdapter {
    private List<Fragment> list = new ArrayList<>();

    public ViewPagerAdaptor(FragmentManager fm) {
        super(fm);
    }
    public void add(Fragment fragment){
        this.list.add(fragment);
        notifyDataSetChanged();
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
