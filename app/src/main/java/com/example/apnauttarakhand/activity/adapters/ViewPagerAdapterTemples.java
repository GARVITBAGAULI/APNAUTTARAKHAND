package com.example.apnauttarakhand.activity.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.apnauttarakhand.fragments.FragmentBadrinath;
import com.example.apnauttarakhand.fragments.FragmentChampawat;
import com.example.apnauttarakhand.fragments.FragmentDehradun;
import com.example.apnauttarakhand.fragments.FragmentKedarnath;
import com.example.apnauttarakhand.fragments.FragmentNainital;
import com.example.apnauttarakhand.fragments.FragmentPithoragarh;

public class ViewPagerAdapterTemples extends FragmentStateAdapter {


    public ViewPagerAdapterTemples(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch(position){
            case 0:
                fragment = FragmentKedarnath.newInstance();
                break;
            case 1 :
                fragment = FragmentBadrinath.newInstance();
                break;

            default:
                return null;
        }


        return fragment;
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
