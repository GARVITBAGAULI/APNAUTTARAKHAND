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

public class FragmentBadrinath extends Fragment {

    public static FragmentBadrinath newInstance(){

        return new FragmentBadrinath();
    }

    private ImageView imageViewBadrinath;
    private ProgressBar progressBarBadrinath;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.fragment_badrinath,container,false);

       imageViewBadrinath = view.findViewById(R.id.imageViewBadrinath);
        progressBarBadrinath = view.findViewById(R.id.progressBarBadrinath);

        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSj7rQdfN03Hmbz5LCVOmYF3dQ8VyZjmyh6gg&usqp=CAU")
                .into(imageViewBadrinath, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarBadrinath.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {
                        Toast.makeText(getActivity(),e.getLocalizedMessage(),Toast.LENGTH_LONG).show();
                        progressBarBadrinath.setVisibility(View.INVISIBLE);
                    }
                });
        return view;
    }
}
