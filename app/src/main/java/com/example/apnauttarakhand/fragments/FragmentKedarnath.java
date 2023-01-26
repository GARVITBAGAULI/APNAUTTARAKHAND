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

public class FragmentKedarnath extends Fragment {

    public static FragmentKedarnath newInstance(){

        return new FragmentKedarnath();
    }

    private ImageView imageViewKedarnath;
    private ProgressBar progressBarKedarnath;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_kedarnath,container,false);

       imageViewKedarnath = view.findViewById(R.id.imageViewKedarnath);
        progressBarKedarnath = view.findViewById(R.id.progressBarKedarnath);

        Picasso.get().load("https://www.bizarexpedition.com/images/kedar.jpg")
                .into(imageViewKedarnath, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarKedarnath.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarKedarnath.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
