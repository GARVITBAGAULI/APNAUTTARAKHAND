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

public class FragmentDehradun extends Fragment {

    public static FragmentDehradun newInstance(){

        return new FragmentDehradun();
    }

    private ImageView imageViewDehradun;
    private ProgressBar progressBarDehradun;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_dehradun,container,false);

       imageViewDehradun = view.findViewById(R.id.imageViewDehradun);
        progressBarDehradun = view.findViewById(R.id.progressBarDehradun);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Forest_research_institute" +
                "_3%2C_Dehra_dun.jpg/536px-Forest_research_institute_3%2C_Dehra_dun.jpg")
                .into(imageViewDehradun, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarDehradun.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarDehradun.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
