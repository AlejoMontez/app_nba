package com.example.alejomontez.appnba.Users.repository;

import com.example.alejomontez.appnba.ApiRest.RestApiAdapter;
import com.example.alejomontez.appnba.ApiRest.Service;
import com.example.alejomontez.appnba.Teams.interactor.TeamFragmentInteractor;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Users.interactor.UserFragmentInteractor;
import com.example.alejomontez.appnba.Users.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserFragmentRepositoryImpl implements UserFragmentRepository {



    private UserFragmentInteractor userFragmentInteractor;
    List<Users> usersList;

    public UserFragmentRepositoryImpl(UserFragmentInteractor userFragmentInteractor) {
        this.userFragmentInteractor = userFragmentInteractor;
    }



    @Override
    public void getDataUser() {


        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Users>> users = service.getDataUser();
        users.enqueue(new Callback<List<Users>>() {
            @Override
            public void onResponse(Call<List<Users>> call, Response<List<Users>> response) {
                usersList = response.body();
                userFragmentInteractor.showResultUser(usersList);
            }

            @Override
            public void onFailure(Call<List<Users>> call, Throwable t) {
                //
            }
        });
    }
}
