package com.example.alejomontez.appnba.Teams.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alejomontez.appnba.R;
import com.example.alejomontez.appnba.Stadiums.adapter.StadiumAdapter;
import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.squareup.picasso.Picasso;

import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter {


    List<Teams> teamsList;
    Context context;

    public TeamAdapter(List<Teams> teamsList, Context context) {
        this.teamsList = teamsList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new ViewHolderTeam(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Teams object = teamsList.get(position);
        TeamAdapter.ViewHolderTeam viewHolderTeam = (TeamAdapter.ViewHolderTeam) holder;
        viewHolderTeam.textViewName.setText(object.getNombre());
        viewHolderTeam.TextViewCoach.setText(object.getEntrenador());
        Picasso.get().load(object.getLogo()).into(viewHolderTeam.imageViewTeamImg);
    }

    @Override
    public int getItemCount() {
        return teamsList.size();
    }

    public class ViewHolderTeam extends RecyclerView.ViewHolder{
        TextView textViewName, textViewLogo, TextViewCoach;
        ImageView imageViewTeamImg;

        public ViewHolderTeam(View item) {
            super(item);
            textViewName = item.findViewById(R.id.id_txv_team);
            TextViewCoach = item.findViewById(R.id.txtName_coach);
            imageViewTeamImg = item.findViewById(R.id.img_logo);

        }
    }

}
