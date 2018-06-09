package com.example.alejomontez.appnba.Players.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alejomontez.appnba.Groups.adapter.GroupAdapter;
import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.Players.model.Players;
import com.example.alejomontez.appnba.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class PlayerAdapter extends RecyclerView.Adapter {


    List<Players> playersList;
    Context context;

    public PlayerAdapter(List<Players> playersList, Context context) {
        this.playersList = playersList;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false);
        return new PlayerAdapter.ViewHolderPlayer(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Players object = playersList.get(position);
        PlayerAdapter.ViewHolderPlayer viewHolderPlayer = (PlayerAdapter.ViewHolderPlayer) holder;
        viewHolderPlayer.textViewplayerTitle.setText(object.getEquipo());
        viewHolderPlayer.textViewplayerName1.setText(object.getNombre1());
        viewHolderPlayer.textViewplayerName2.setText(object.getNombre2());
        viewHolderPlayer.textViewplayerName3.setText(object.getNombre3());
        viewHolderPlayer.textViewplayerName4.setText(object.getNombre4());
        viewHolderPlayer.textViewplayerName5.setText(object.getNombre5());

        Picasso.get().load(object.getJuga_img1()).into(viewHolderPlayer.circleImageViewplayer1);
        Picasso.get().load(object.getJuga_img2()).into(viewHolderPlayer.circleImageViewplayer2);
        Picasso.get().load(object.getJuga_img3()).into(viewHolderPlayer.circleImageViewplayer3);
        Picasso.get().load(object.getJuga_img4()).into(viewHolderPlayer.circleImageViewplayer4);
        Picasso.get().load(object.getJuga_img5()).into(viewHolderPlayer.circleImageViewplayer5);


    }

    @Override
    public int getItemCount() {
        return playersList.size();
    }

    public class ViewHolderPlayer extends RecyclerView.ViewHolder{
        TextView textViewplayerTitle, textViewplayerName1, textViewplayerName2, textViewplayerName3, textViewplayerName4, textViewplayerName5;
        CircleImageView circleImageViewplayer1, circleImageViewplayer2, circleImageViewplayer3, circleImageViewplayer4, circleImageViewplayer5;

        public ViewHolderPlayer(View item) {
            super(item);
            textViewplayerTitle = item.findViewById(R.id.id_txv_player_title);
            textViewplayerName1 = item.findViewById(R.id.id_txv_player_name1);
            textViewplayerName2 = item.findViewById(R.id.id_txv_player_name2);
            textViewplayerName3 = item.findViewById(R.id.id_txv_player_name3);
            textViewplayerName4 = item.findViewById(R.id.id_txv_player_name4);
            textViewplayerName5 = item.findViewById(R.id.id_txv_player_name5);
            circleImageViewplayer1 = item.findViewById(R.id.id_img_player_1);
            circleImageViewplayer2 = item.findViewById(R.id.id_img_player_2);
            circleImageViewplayer3 = item.findViewById(R.id.id_img_player_3);
            circleImageViewplayer4 = item.findViewById(R.id.id_img_player_4);
            circleImageViewplayer5 = item.findViewById(R.id.id_img_player_5);


        }
    }
}
