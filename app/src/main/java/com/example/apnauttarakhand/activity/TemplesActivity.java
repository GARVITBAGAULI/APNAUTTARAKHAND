package com.example.apnauttarakhand.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.apnauttarakhand.R;
import com.example.apnauttarakhand.activity.adapters.ViewPagerAdapterDistrict;
import com.example.apnauttarakhand.activity.adapters.ViewPagerAdapterTemples;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TemplesActivity extends AppCompatActivity {

    private TabLayout tabLayoutTemples;
    private ViewPager2 viewPagerTemples;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temples);

        tabLayoutTemples = findViewById(R.id.tabLayoutKedarnath);
        viewPagerTemples = findViewById(R.id.viewPagerKedarnath);

        ViewPagerAdapterTemples adapter = new ViewPagerAdapterTemples(getSupportFragmentManager(),getLifecycle());
        viewPagerTemples.setAdapter(adapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutTemples, viewPagerTemples,
                true, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                switch(position){
                    case 0:
                        tab.setText("Kedarnath");
                        break;
                    case 1:
                        tab.setText("Badrinath");
                        break;

                }

            }
        });
        tabLayoutMediator.attach();

    }
}