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

public class FragmentLohaghat extends Fragment {

    public static FragmentLohaghat newInstance(){

        return new FragmentLohaghat();
    }

    private ImageView imageViewLohaghat;
    private ProgressBar progressBarLohaghat;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_lohaghat,container,false);

       imageViewLohaghat = view.findViewById(R.id.imageViewlohaghat);
        progressBarLohaghat = view.findViewById(R.id.progressBarlohaghat);

        Picasso.get().load("https://www.euttaranchal.com/tourism/photos/lohaghat-3490409.jpg")
                .into(imageViewLohaghat, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarLohaghat.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarLohaghat.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
