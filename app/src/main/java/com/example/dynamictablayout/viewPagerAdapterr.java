package com.example.dynamictablayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class viewPagerAdapterr extends FragmentStateAdapter {


    public viewPagerAdapterr(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0){
            return  new BlankFragment1();
        }else if (position == 1){
            return  new BlankFragment2();
        } else if (position == 2) {
            return new BlankFragment3();
        } else if (position == 3) {
            return new BlankFragment4();
        }
        return new BlankFragment1();
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
