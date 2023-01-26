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

public class Fragmentjaswantsingh extends Fragment {

    public static Fragmentjaswantsingh newInstance(){

        return new Fragmentjaswantsingh();
    }

    private ImageView imageViewJaswantsingh;
    private ProgressBar progressBarJaswantsingh;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_jaswantsingh,container,false);

       imageViewJaswantsingh = view.findViewById(R.id.imageViewjaswantsingh);
        progressBarJaswantsingh = view.findViewById(R.id.progressBarjaswantsingh);

         Picasso.get().load("https://www.ssbtosuccess.com/wp-content/uploads/2022/07/rifleman-jaswant-singh-rawat-a-soldier-who-killed-300-chinese-all-alone.jpg")
           .into(imageViewJaswantsingh, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarJaswantsingh.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarJaswantsingh.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
