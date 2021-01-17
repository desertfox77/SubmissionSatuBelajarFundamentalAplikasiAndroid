package com.example.subsatu.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.subsatu.DetailActivity;
import com.example.subsatu.R;
import com.example.subsatu.model.Data;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private ArrayList<Data> dataArrayList;
    public String[] mColors = {"#3F51B5","#FF9800","#009688","#673AB7"};


    public MainAdapter(ArrayList<Data> myDataset) {
            dataArrayList = myDataset;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageView.setImageResource(dataArrayList.get(position).getAvatar1());
        holder.tvUsername.setText(dataArrayList.get(position).getUsername1());
        holder.tvName.setText(dataArrayList.get(position).getName1());
        holder.tvLocation.setText(dataArrayList.get(position).getLocation1());
        holder.cvProduct.setCardBackgroundColor(Color.parseColor(mColors[position % 4]));
    }

    @Override
    public int getItemCount() {
        return dataArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView imageView;
        public CardView cvProduct;
        public TextView tvUsername,tvName, tvLocation;

        public MyViewHolder(View v) {
            super(v);
            cvProduct = v.findViewById(R.id.cv_product);
            imageView = v.findViewById(R.id.imageView);
            tvUsername = v.findViewById(R.id.tv_username);
            tvName = v.findViewById(R.id.tv_name);
            tvLocation = v.findViewById(R.id.tv_location);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            int position = getAdapterPosition();
            Intent i = new Intent(view.getContext(), DetailActivity.class);
            i.putExtra("position",dataArrayList.get(position));
            view.getContext().startActivity(i);
        }
    }
}
