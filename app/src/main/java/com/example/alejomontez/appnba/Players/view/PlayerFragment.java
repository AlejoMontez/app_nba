package com.example.alejomontez.appnba.Players.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.alejomontez.appnba.Groups.adapter.GroupAdapter;
import com.example.alejomontez.appnba.Groups.presenter.GroupFragmentPresenter;
import com.example.alejomontez.appnba.Groups.presenter.GroupFragmentPresenterImpl;
import com.example.alejomontez.appnba.Players.adapter.PlayerAdapter;
import com.example.alejomontez.appnba.Players.model.Players;
import com.example.alejomontez.appnba.Players.presenter.PlayerFragmentPresenter;
import com.example.alejomontez.appnba.Players.presenter.PlayerFragmentPresenterImpl;
import com.example.alejomontez.appnba.R;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerFragment extends Fragment implements PlayerFragmentView{

    private PlayerFragmentPresenter playerFragmentPresenter;
    ProgressBar progressBarPlayer;
    RecyclerView recyclerViewPlayer;

    public PlayerFragment() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_player, container, false);

        progressBarPlayer = (ProgressBar) view.findViewById(R.id.id_pgb_player);
        recyclerViewPlayer = (RecyclerView) view.findViewById(R.id.id_rcv_player);
        recyclerViewPlayer.setLayoutManager(new LinearLayoutManager(getContext()));

        playerFragmentPresenter = new PlayerFragmentPresenterImpl(this);

        progressBarPlayer.setVisibility(View.VISIBLE);
        playerFragmentPresenter.getDataPlayer();

        return view;
    }

    @Override
    public void showResultPlayer(List<Players> playersList) {
        progressBarPlayer.setVisibility(View.GONE);
        recyclerViewPlayer.setAdapter(new PlayerAdapter(playersList, getContext()));
    }
}
