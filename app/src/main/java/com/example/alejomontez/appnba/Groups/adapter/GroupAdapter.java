package com.example.alejomontez.appnba.Groups.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class GroupAdapter extends RecyclerView.Adapter {

    List<Group> groupList;
    Context context;

    public GroupAdapter(List<Group> groupList, Context context) {
        this.groupList = groupList;
        this.context = context;
    }

    // ********************************************************************************************

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_group, parent, false);
        return new ViewHolderGroup(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Group object = groupList.get(position);
        ViewHolderGroup viewHolderGroup = (ViewHolderGroup) holder;
        viewHolderGroup.textViewGroupTitle.setText(object.getGrupo());
        viewHolderGroup.textViewGroupTeamName1.setText(object.getEquipo1());
        viewHolderGroup.textViewGroupTeamName2.setText(object.getEquipo2());
        viewHolderGroup.textViewGroupTeamName3.setText(object.getEquipo3());
        viewHolderGroup.textViewGroupTeamName4.setText(object.getEquipo4());
        viewHolderGroup.textViewGroupTeamName5.setText(object.getEquipo5());
        viewHolderGroup.textViewGroupTeamName6.setText(object.getEquipo6());
        Picasso.get().load(object.getEquipo_img1()).into(viewHolderGroup.circleImageViewGroupTeam1);
        Picasso.get().load(object.getEquipo_img2()).into(viewHolderGroup.circleImageViewGroupTeam2);
        Picasso.get().load(object.getEquipo_img3()).into(viewHolderGroup.circleImageViewGroupTeam3);
        Picasso.get().load(object.getEquipo_img4()).into(viewHolderGroup.circleImageViewGroupTeam4);
        Picasso.get().load(object.getEquipo_img5()).into(viewHolderGroup.circleImageViewGroupTeam5);
        Picasso.get().load(object.getEquipo_img6()).into(viewHolderGroup.circleImageViewGroupTeam6);
    }

    @Override
    public int getItemCount() {
        return groupList.size();
    }

    // ********************************************************************************************

    public class ViewHolderGroup extends RecyclerView.ViewHolder{
        TextView textViewGroupTitle, textViewGroupTeamName1, textViewGroupTeamName2, textViewGroupTeamName3, textViewGroupTeamName4, textViewGroupTeamName5, textViewGroupTeamName6;
        CircleImageView circleImageViewGroupTeam1, circleImageViewGroupTeam2, circleImageViewGroupTeam3, circleImageViewGroupTeam4, circleImageViewGroupTeam5, circleImageViewGroupTeam6;

        public ViewHolderGroup(View item) {
            super(item);
            textViewGroupTitle = item.findViewById(R.id.id_txv_group_title);
            textViewGroupTeamName1 = item.findViewById(R.id.id_txv_group_teamname1);
            textViewGroupTeamName2 = item.findViewById(R.id.id_txv_group_teamname2);
            textViewGroupTeamName3 = item.findViewById(R.id.id_txv_group_teamname3);
            textViewGroupTeamName4 = item.findViewById(R.id.id_txv_group_teamname4);
            textViewGroupTeamName5 = item.findViewById(R.id.id_txv_group_teamname5);
            textViewGroupTeamName6 = item.findViewById(R.id.id_txv_group_teamname6);
            circleImageViewGroupTeam1 = item.findViewById(R.id.id_img_group_team1);
            circleImageViewGroupTeam2 = item.findViewById(R.id.id_img_group_team2);
            circleImageViewGroupTeam3 = item.findViewById(R.id.id_img_group_team3);
            circleImageViewGroupTeam4 = item.findViewById(R.id.id_img_group_team4);
            circleImageViewGroupTeam5 = item.findViewById(R.id.id_img_group_team5);
            circleImageViewGroupTeam6 = item.findViewById(R.id.id_img_group_team6);

        }
    }
}
