package com.nrtec.mouni.tabview;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.pager);
        tb = (TabLayout)findViewById(R.id.tab);
        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
        tb.setupWithViewPager(viewPager);



    }
    class TabAdapter extends FragmentPagerAdapter {
        public TabAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Flowers();
                case 1:
                    return new Birds();
                case 2:
                    return new Animals();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return "FLOWERS";
                case 1:
                    return "ANIMALS";
                case 2:
                    return "BIRDS";
            }
            return super.getPageTitle(position);
        }
    }

}
