package com.example.apnauttarakhand.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.apnauttarakhand.R;
import com.example.apnauttarakhand.activity.adapters.ViewPagerAdapterDistrict;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class districtActivity extends AppCompatActivity {

    private TabLayout tabLayoutDistrict;
    private ViewPager2 viewPagerDistrict;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);

        tabLayoutDistrict = findViewById(R.id.tabLayoutDehradun);
        viewPagerDistrict = findViewById(R.id.viewPagerDehradun);

        ViewPagerAdapterDistrict adapter = new ViewPagerAdapterDistrict(getSupportFragmentManager(),getLifecycle());
        viewPagerDistrict.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutDistrict, viewPagerDistrict,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        tab.setText("Dehradun");
                        break;
                    case 1:
                        tab.setText("Champawat");
                        break;
                    case 2:
                        tab.setText("Pithoragarh");
                        break;
                    case 3:
                        tab.setText("Nainital");
                        break;
                }

            }
        });
        tabLayoutMediator.attach();
    }
}