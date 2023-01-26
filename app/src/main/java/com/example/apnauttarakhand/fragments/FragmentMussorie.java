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

public class FragmentMussorie extends Fragment {

    public static FragmentMussorie newInstance(){

        return new FragmentMussorie();
    }

    private ImageView imageViewMussorie;
    private ProgressBar progressBarMussorie;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_mussorie,container,false);

       imageViewMussorie = view.findViewById(R.id.imageViewMussorie);
        progressBarMussorie = view.findViewById(R.id.progressBarMussorie);

        Picasso.get().load("https://static.toiimg.com/photo/86290693.cms")
                .into(imageViewMussorie, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarMussorie.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarMussorie.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
