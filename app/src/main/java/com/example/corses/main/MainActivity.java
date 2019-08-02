package com.example.corses.main;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.corses.base.ViewPagerChaneListener;
import com.example.corses.main.category.CategoryFragment;
import com.example.corses.main.nome.HomeFragment;
import com.example.corses.R;
import com.example.corses.base.ViewPagerAdaptor;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViewPager();
        setupBottomNavigation();
    }

    private void setupViewPager() {
        viewPager = findViewById(R.id.viewPager);

        ViewPagerAdaptor adaptor = new ViewPagerAdaptor(getSupportFragmentManager());
        adaptor.add(new HomeFragment());
        adaptor.add(new CategoryFragment());
        viewPager.setAdapter(adaptor);
    }

    private void setupBottomNavigation() {
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(listener);
        viewPager.addOnPageChangeListener(viewPagerChaneListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.itemHome: {
                    viewPager.setCurrentItem(0, true);
                    return true;
                }
                case R.id.itemCategory: {
                    viewPager.setCurrentItem(1, true);
                    return true;
                }
            }

            return false;
        }
    };
    private ViewPagerChaneListener viewPagerChaneListener = new ViewPagerChaneListener() {
        @Override
        protected void onPegScroll(int position) {
            switch (position) {
                case 0:
                    bottomNavigationView.setSelectedItemId(R.id.itemHome);
                    break;
                case 1:
                    bottomNavigationView.setSelectedItemId(R.id.itemCategory);
                    break;
            }
        }
    };
}
