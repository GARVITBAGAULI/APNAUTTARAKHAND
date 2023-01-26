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

public class FragmentNainital extends Fragment {

    public static FragmentNainital newInstance(){
        return new FragmentNainital();
    }

    private ImageView imageViewNainital;
    private ProgressBar progressBarNainital;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_nanital,container,false);

        imageViewNainital   = view.findViewById(R.id.imageViewNanital);
        progressBarNainital = view.findViewById(R.id.progressBarNanital);

        Picasso.get().load("https://static.toiimg.com/img/92198781/Master.jpg")
                .into( imageViewNainital, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarNainital.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarNainital.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
