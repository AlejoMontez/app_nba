package com.example.alejomontez.appnba.Teams.interactor;

import com.example.alejomontez.appnba.Stadiums.presenter.StadiumsFragmentPresenter;
import com.example.alejomontez.appnba.Stadiums.repository.StadiumsFragmentRepository;
import com.example.alejomontez.appnba.Stadiums.repository.StadiumsFragmentRepositoryImpl;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Teams.presenter.TeamFragmentPresenter;
import com.example.alejomontez.appnba.Teams.repository.TeamFragmentRepository;
import com.example.alejomontez.appnba.Teams.repository.TeamFragmentRepositoryImpl;

import java.util.List;

public class TeamFragmentInteractorImpl implements TeamFragmentInteractor{


    private TeamFragmentPresenter teamFragmentPresenter;
    private TeamFragmentRepository teamFragmentRepository;

    public TeamFragmentInteractorImpl(TeamFragmentPresenter teamFragmentPresenter) {
        this.teamFragmentPresenter = teamFragmentPresenter;
        teamFragmentRepository = new TeamFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataTeam() {
        teamFragmentRepository.getDataTeam();
    }

    @Override
    public void showResultTeam(List<Teams> teamsList) {
        teamFragmentPresenter.showResultTeam(teamsList);
    }
}
