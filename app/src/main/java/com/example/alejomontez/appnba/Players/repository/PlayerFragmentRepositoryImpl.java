package com.example.alejomontez.appnba.Players.repository;

import com.example.alejomontez.appnba.ApiRest.RestApiAdapter;
import com.example.alejomontez.appnba.ApiRest.Service;
import com.example.alejomontez.appnba.Groups.interactor.GroupFragmentInteractor;
import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.Players.interactor.PlayerFragmentInteractor;
import com.example.alejomontez.appnba.Players.model.Players;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PlayerFragmentRepositoryImpl implements PlayerFragmentRepository {

    private PlayerFragmentInteractor playerFragmentInteractor;
    List<Players> playersList;

    public PlayerFragmentRepositoryImpl(PlayerFragmentInteractor playerFragmentInteractor) {
        this.playerFragmentInteractor = playerFragmentInteractor;

    }

    @Override
    public void getDataPlayer() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Players>> player = service.getDataPlayer();
        player.enqueue(new Callback<List<Players>>() {
            @Override
            public void onResponse(Call<List<Players>> call, Response<List<Players>> response) {
                playersList = response.body();
                playerFragmentInteractor.showResultPlayer(playersList);
            }

            @Override
            public void onFailure(Call<List<Players>> call, Throwable t) {
                //
            }
        });
    }
}
