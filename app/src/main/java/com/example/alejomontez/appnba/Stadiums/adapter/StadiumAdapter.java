package com.example.alejomontez.appnba.Stadiums.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alejomontez.appnba.R;
import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.squareup.picasso.Picasso;

import java.util.List;

public class StadiumAdapter extends RecyclerView.Adapter {

    List<Stadium> stadiumList;
    Context context;

    public StadiumAdapter(List<Stadium> stadiumList, Context context) {
        this.stadiumList = stadiumList;
        this.context = context;
    }

    // ********************************************************************************************

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stadium, parent, false);
        return new ViewHolderStadium(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Stadium object = stadiumList.get(position);
        ViewHolderStadium viewHolderStadium = (ViewHolderStadium) holder;
        viewHolderStadium.textViewStadiumTitle.setText(object.getNombre());
        viewHolderStadium.textViewStadiumCapacity.setText(object.getCapacidad());
        viewHolderStadium.TextViewStadiumCity.setText(object.getCiudad());
        viewHolderStadium.TextViewStadiumYear.setText(object.getAnio());
        Picasso.get().load(object.getUrl()).into(viewHolderStadium.imageViewStadiumImg);
    }

    @Override
    public int getItemCount() {
        return stadiumList.size();
    }

    // ********************************************************************************************

    public class ViewHolderStadium extends RecyclerView.ViewHolder{
        TextView textViewStadiumCapacity, textViewStadiumTitle, TextViewStadiumCity, TextViewStadiumYear;
        ImageView imageViewStadiumImg;

        public ViewHolderStadium(View item) {
            super(item);
            textViewStadiumTitle = item.findViewById(R.id.id_txv_stadium_title);
            textViewStadiumCapacity = item.findViewById(R.id.id_txv_stadium_capacity);
            TextViewStadiumCity = item.findViewById(R.id.id_txv_stadium_city);
            TextViewStadiumYear = item.findViewById(R.id.id_txv_stadium_year);
            imageViewStadiumImg = item.findViewById(R.id.id_img_stadium);
        }
    }
}
