package com.example.corses.base;


import androidx.viewpager.widget.ViewPager;

public abstract class ViewPagerChaneListener implements ViewPager.OnPageChangeListener {

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override
    public void onPageSelected(int position) {
        onPegScroll(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
    protected abstract void onPegScroll(int position);
}
