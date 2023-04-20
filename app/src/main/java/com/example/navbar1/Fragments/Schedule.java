package com.example.navbar1.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;

import com.example.navbar1.Naviewpager;
import com.example.navbar1.R;
import com.google.android.material.tabs.TabLayout;


public class Schedule extends Fragment {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    private Naviewpager viewPager;

    @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);
//
//        tabLayout = view.findViewById(R.id.tabs1);
//        viewPager2 = view.findViewById(R.id.view1);
//        viewPager = new Naviewpager(this);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                // This method will be called when a tab is selected
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                // This method will be called when a tab is unselected
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                // This method will be called when a tab is reselected
//            }
//
//
//        });
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager2.setCurrentItem(tab.getPosition());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//
//        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
//            @Override
//            public void onPageSelected(int position) {
//                super.onPageSelected(position);
//                tabLayout.getTabAt(position).select();
//            }
//        });
//
//        return view;
//    }
//
//
//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        String selectedOption = adapterView.getItemAtPosition(i).toString();
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {

        return view;
    }
}
