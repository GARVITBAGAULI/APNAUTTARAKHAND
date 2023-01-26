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

public class FragmentPithoragarh extends Fragment {

    public static FragmentPithoragarh newInstance(){
        return new FragmentPithoragarh();
    }

    private ImageView imageViewPithoragarh;
    private ProgressBar progressBarPithoragarh;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_pithoragarh,container,false);

        imageViewPithoragarh   = view.findViewById(R.id.imageViewPithoragarh);
        progressBarPithoragarh = view.findViewById(R.id.progressBarPithoragarh);

        Picasso.get().load("https://chaloghumane.com/wp-content/uploads/2021/08/Pithoragarh.jpg")
                .into( imageViewPithoragarh, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarPithoragarh.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarPithoragarh.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
