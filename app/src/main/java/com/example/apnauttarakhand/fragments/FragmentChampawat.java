package com.example.apnauttarakhand.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.apnauttarakhand.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentChampawat extends Fragment {

    public static FragmentChampawat newInstance(){
        return new FragmentChampawat();
    }

    private ImageView imageViewChampawat;
    private ProgressBar progressBarChampawat;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_champawat,container,false);

        imageViewChampawat   = view.findViewById(R.id.imageViewChampawat);
        progressBarChampawat = view.findViewById(R.id.progressBarChampawat);

        Picasso.get().load("https://i.ytimg.com/vi/syaKg_lGGRs/maxresdefault.jpg")
                .into( imageViewChampawat, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarChampawat.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarChampawat.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
