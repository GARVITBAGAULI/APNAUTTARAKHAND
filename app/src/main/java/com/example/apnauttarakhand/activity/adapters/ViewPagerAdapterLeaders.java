package com.example.apnauttarakhand.activity.adapters;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.apnauttarakhand.fragments.FragmentChampawat;
import com.example.apnauttarakhand.fragments.FragmentDehradun;
import com.example.apnauttarakhand.fragments.FragmentMsDhoni;
import com.example.apnauttarakhand.fragments.FragmentNainital;
import com.example.apnauttarakhand.fragments.FragmentPithoragarh;
import com.example.apnauttarakhand.fragments.Fragmentjaswantsingh;

public class ViewPagerAdapterLeaders extends FragmentStateAdapter {


    public ViewPagerAdapterLeaders(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;

        switch(position){
            case 0:
                fragment = Fragmentjaswantsingh.newInstance();
                break;

            case 1:
                fragment = FragmentMsDhoni.newInstance();
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
