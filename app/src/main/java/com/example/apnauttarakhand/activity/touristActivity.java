package com.example.apnauttarakhand.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.apnauttarakhand.R;
import com.example.apnauttarakhand.activity.adapters.ViewPagerAdapterTourist;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class touristActivity extends AppCompatActivity {

    private TabLayout tabLayoutTourist;
    private ViewPager2 viewpagerTourist;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourist);

        tabLayoutTourist = findViewById(R.id.tabLayoutTourist);
        viewpagerTourist = findViewById(R.id.viewPagerTourist);

        ViewPagerAdapterTourist adapter = new ViewPagerAdapterTourist(getSupportFragmentManager(),getLifecycle());
        viewpagerTourist.setAdapter(adapter);

           TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayoutTourist, viewpagerTourist, true
                , true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

                if(position==0){
                    tab.setText("Mussorie");
                }
                if(position==1){
                    tab.setText("Auli");
                }
                if(position==2){
                    tab.setText("Lohaghat");
                }
            }
        });

        tabLayoutMediator.attach();
    }
}