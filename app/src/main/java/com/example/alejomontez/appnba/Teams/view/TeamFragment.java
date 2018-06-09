package com.example.alejomontez.appnba.Teams.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.alejomontez.appnba.R;
import com.example.alejomontez.appnba.Stadiums.adapter.StadiumAdapter;
import com.example.alejomontez.appnba.Stadiums.presenter.StadiumsFragmentPresenter;
import com.example.alejomontez.appnba.Stadiums.presenter.StadiumsFragmentPresenterImpl;
import com.example.alejomontez.appnba.Teams.adapter.TeamAdapter;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Teams.presenter.TeamFragmentPresenter;
import com.example.alejomontez.appnba.Teams.presenter.TeamFragmentPresenterImpl;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeamFragment extends Fragment implements TeamFragmentView{

    private TeamFragmentPresenter teamFragmentPresenter;
    ProgressBar progressBarTeam;
    RecyclerView recyclerViewTeam;

    public TeamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_team, container, false);

        progressBarTeam = (ProgressBar) view.findViewById(R.id.id_pgb_team);
        recyclerViewTeam = (RecyclerView) view.findViewById(R.id.id_rcv_team);
        recyclerViewTeam.setLayoutManager(new LinearLayoutManager(getContext()));

        teamFragmentPresenter = new TeamFragmentPresenterImpl(this) {
        };

        progressBarTeam.setVisibility(View.VISIBLE);
        teamFragmentPresenter.getDataTeam();

        return view;
    }

    @Override
    public void showResultTeam(List<Teams> teamsList) {

        progressBarTeam.setVisibility(View.GONE);
        recyclerViewTeam.setAdapter(new TeamAdapter(teamsList, getContext()));
    }
}
