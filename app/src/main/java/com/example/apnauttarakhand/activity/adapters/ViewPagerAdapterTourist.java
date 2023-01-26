package com.example.apnauttarakhand.activity.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.apnauttarakhand.fragments.FragmentChampawat;
import com.example.apnauttarakhand.fragments.FragmentDehradun;
import com.example.apnauttarakhand.fragments.FragmentLohaghat;
import com.example.apnauttarakhand.fragments.FragmentMussorie;
import com.example.apnauttarakhand.fragments.FragmentNainital;
import com.example.apnauttarakhand.fragments.FragmentPithoragarh;
import com.example.apnauttarakhand.fragments.Fragmentauli;

public class ViewPagerAdapterTourist extends FragmentStateAdapter {


    public ViewPagerAdapterTourist(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch(position){
            case 0:
                fragment = FragmentMussorie.newInstance();
                break;
            case 1:
                fragment  = Fragmentauli.newInstance();
                break;

            case 2:
                fragment = FragmentLohaghat.newInstance();
                    break;

            default:
                return null;
        }


        return fragment;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
