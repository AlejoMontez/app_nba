package com.example.alejomontez.appnba.Teams.presenter;

import com.example.alejomontez.appnba.Stadiums.interactor.StadiumsFragmentInteractor;
import com.example.alejomontez.appnba.Stadiums.interactor.StadiumsFragmentInteractorImpl;
import com.example.alejomontez.appnba.Stadiums.view.StadiumsFragmentView;
import com.example.alejomontez.appnba.Teams.interactor.TeamFragmentInteractor;
import com.example.alejomontez.appnba.Teams.interactor.TeamFragmentInteractorImpl;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Teams.view.TeamFragmentView;

import java.util.List;

public class TeamFragmentPresenterImpl implements TeamFragmentPresenter {

    private TeamFragmentView teamFragmentView;
    private TeamFragmentInteractor teamFragmentInteractor;

    public TeamFragmentPresenterImpl(TeamFragmentView teamFragmentView) {
        this.teamFragmentView = teamFragmentView;
        teamFragmentInteractor = new TeamFragmentInteractorImpl(this);
    }

    @Override
    public void showResultTeam(List<Teams> teamsList) {
        teamFragmentView.showResultTeam(teamsList);

    }

    @Override
    public void getDataTeam() {

        teamFragmentInteractor.getDataTeam();
    }
}
