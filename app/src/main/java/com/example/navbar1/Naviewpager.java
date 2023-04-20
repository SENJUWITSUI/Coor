package com.example.navbar1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.navbar1.Fragments.Cancelled;
import com.example.navbar1.Fragments.Completed;
import com.example.navbar1.Fragments.Pending;
import com.example.navbar1.Fragments.Verified;

public class Naviewpager extends FragmentStateAdapter {
    public Naviewpager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new Pending();
            case 1:
                return new Verified();
            case 2:
                return new Completed();
            case 3:
                return new Cancelled();
            default:
                return new Pending();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
