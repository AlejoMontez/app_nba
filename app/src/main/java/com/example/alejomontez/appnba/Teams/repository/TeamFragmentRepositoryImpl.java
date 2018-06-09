package com.example.alejomontez.appnba.Teams.repository;

import com.example.alejomontez.appnba.ApiRest.RestApiAdapter;
import com.example.alejomontez.appnba.ApiRest.Service;
import com.example.alejomontez.appnba.Stadiums.interactor.StadiumsFragmentInteractor;
import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Teams.interactor.TeamFragmentInteractor;
import com.example.alejomontez.appnba.Teams.model.Teams;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TeamFragmentRepositoryImpl implements TeamFragmentRepository{


    private TeamFragmentInteractor teamFragmentInteractor;
    List<Teams> teamsList;

    public TeamFragmentRepositoryImpl(TeamFragmentInteractor teamFragmentInteractor) {
        this.teamFragmentInteractor = teamFragmentInteractor;
    }


    @Override
    public void getDataTeam() {

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Teams>> teams = service.getDataTeam();
        teams.enqueue(new Callback<List<Teams>>() {
            @Override
            public void onResponse(Call<List<Teams>> call, Response<List<Teams>> response) {
                teamsList = response.body();
                teamFragmentInteractor.showResultTeam(teamsList);
            }

            @Override
            public void onFailure(Call<List<Teams>> call, Throwable t) {
                //
            }
        });

    }
}
