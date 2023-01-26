package com.example.apnauttarakhand.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.apnauttarakhand.ModelClass;
import com.example.apnauttarakhand.R;
import com.example.apnauttarakhand.activity.adapters.AdapterClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelClass> arrayList;
    private AdapterClass adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
       // recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
     //   recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        arrayList = new ArrayList<>();


        ModelClass modelClass1 = new ModelClass ( "district" ,"THE 13 District of UTTARAKHAND");
        ModelClass modelClass2 = new ModelClass ( "leaders" ,"THE LEADERS OF UTTARAKHAND");
        ModelClass modelClass3 = new ModelClass ( "temples" ,"THE TEMPLES OF UTTARAKHAND");
        ModelClass modelClass4 = new ModelClass ("tourist" ,"THE TOURIST PLACES OF UK");

        arrayList.add(modelClass1);
        arrayList.add(modelClass2);
        arrayList.add(modelClass3);
        arrayList.add(modelClass4);

        adapter = new AdapterClass( arrayList, this);
        recyclerView.setAdapter(adapter);

    }
}