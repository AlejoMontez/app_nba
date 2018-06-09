package com.example.alejomontez.appnba.Users.adpater;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alejomontez.appnba.R;
import com.example.alejomontez.appnba.Teams.adapter.TeamAdapter;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Users.model.Users;
import com.squareup.picasso.Picasso;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter{

    List<Users> usersList;
    Context context;

    public UserAdapter(List<Users> usersList, Context context) {
        this.usersList = usersList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ViewHolderUser(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Users object = usersList.get(position);
        UserAdapter.ViewHolderUser viewHolderUser = (UserAdapter.ViewHolderUser) holder;
        viewHolderUser.textViewName.setText(object.getName());
        viewHolderUser.TextViewEmail.setText(object.getEmail());
        Picasso.get().load(object.getImg_user()).into(viewHolderUser.imageViewUserImg);
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class ViewHolderUser extends RecyclerView.ViewHolder{
        TextView textViewName, TextViewEmail;
        ImageView imageViewUserImg;

        public ViewHolderUser(View item) {
            super(item);
            textViewName = item.findViewById(R.id.id_txv_name);
            TextViewEmail = item.findViewById(R.id.id_txv_email);
            imageViewUserImg = item.findViewById(R.id.img);

        }
    }
}
