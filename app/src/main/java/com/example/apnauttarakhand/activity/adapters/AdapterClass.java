package com.example.apnauttarakhand.activity.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.apnauttarakhand.activity.LeadersActivity;
import com.example.apnauttarakhand.ModelClass;
import com.example.apnauttarakhand.R;
import com.example.apnauttarakhand.activity.TemplesActivity;
import com.example.apnauttarakhand.activity.districtActivity;
import com.example.apnauttarakhand.activity.touristActivity;

import java.util.ArrayList;

public class AdapterClass extends RecyclerView.Adapter<AdapterClass.CardViewHolder> {
    private ArrayList<ModelClass> modelList;
    private Context context;

    public AdapterClass(ArrayList<ModelClass> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        return new  CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, @SuppressLint("RecyclerView") int position) {

            ModelClass model = modelList.get(position);
            holder.textviewSplash.setText(model.getCategoryName());
            holder.imageViewSplash.setImageResource(context.getResources()
                    .getIdentifier(model.getImageName(),"drawable",context.getPackageName()));


            holder.cardView.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick(View v) {

                    if (position == 0) {
                        Intent intent = new Intent(context, districtActivity.class);
                        context.startActivity(intent);

                    }
                    if (position == 1) {
                        Intent intent = new Intent(context, LeadersActivity.class);
                        context.startActivity(intent);

                    }
                    if (position == 2) {
                        Intent intent = new Intent(context, TemplesActivity.class);
                        context.startActivity(intent);

                    }
                    if (position == 3) {
                        Intent intent = new Intent(context, touristActivity.class);
                        context.startActivity(intent);

                    }


                }
            });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewSplash;
        private TextView textviewSplash;
        private CardView cardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewSplash = itemView.findViewById(R.id.imageViewSplash);
            textviewSplash = itemView.findViewById(R.id.textViewSplash);
            cardView = itemView.findViewById(R.id.cardView);

        }
    }




}
