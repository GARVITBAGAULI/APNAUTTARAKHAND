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

public class Fragmentauli extends Fragment {

    public static Fragmentauli newInstance(){

        return new Fragmentauli();
    }

    private ImageView imageViewAuli;
    private ProgressBar progressBarAuli;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_auli,container,false);

       imageViewAuli = view.findViewById(R.id.imageViewAuli);
        progressBarAuli = view.findViewById(R.id.progressBarAuli);

        Picasso.get().load("https://www.holidify.com/images/bgImages/AULI.jpg")
                .into(imageViewAuli, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarAuli.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarAuli.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
