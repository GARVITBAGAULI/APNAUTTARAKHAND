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

public class FragmentMsDhoni extends Fragment {

    public static FragmentMsDhoni newInstance(){
        return new FragmentMsDhoni();
    }

    private ImageView imageViewMsDhoni;
    private ProgressBar progressBarMsDhoni;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_msdhoni,container,false);

        imageViewMsDhoni   = view.findViewById(R.id.imageViewMSDhoni);
        progressBarMsDhoni = view.findViewById(R.id.progressBarMSDhoni);

        Picasso.get().load("https://images.mid-day.com/images/images/2021/jul/dhoni-july-seven_d.jpg")
                .into( imageViewMsDhoni, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMsDhoni.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarMsDhoni.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
