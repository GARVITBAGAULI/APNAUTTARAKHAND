package com.example.apnauttarakhand.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.apnauttarakhand.R;
import com.example.apnauttarakhand.activity.adapters.ViewPagerAdapterDistrict;
import com.example.apnauttarakhand.activity.adapters.ViewPagerAdapterLeaders;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class LeadersActivity extends AppCompatActivity {

    private TabLayout tabLayoutJaswantsingh;
    private ViewPager2 viewPagerJaswantsingh;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);

        tabLayoutJaswantsingh = findViewById(R.id.tabLayoutjaswantsingh);
        viewPagerJaswantsingh = findViewById(R.id.viewPagerjaswantsingh);


        ViewPagerAdapterLeaders adapter = new ViewPagerAdapterLeaders(getSupportFragmentManager(),getLifecycle());
        viewPagerJaswantsingh.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutJaswantsingh, viewPagerJaswantsingh, true,true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        tab.setText("Jaswantsingh");
                        break;
                    case 1:
                        tab.setText("Ms Dhoni");
                        break;
                }

            }
        });
        tabLayoutMediator.attach();
    }
}