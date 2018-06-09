package com.example.alejomontez.appnba.Stadiums.repository;

import com.example.alejomontez.appnba.ApiRest.RestApiAdapter;
import com.example.alejomontez.appnba.ApiRest.Service;
import com.example.alejomontez.appnba.Stadiums.interactor.StadiumsFragmentInteractor;
import com.example.alejomontez.appnba.Stadiums.model.Stadium;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StadiumsFragmentRepositoryImpl implements StadiumsFragmentRepository {

    private StadiumsFragmentInteractor stadiumsFragmentInteractor;
    List<Stadium> stadiumList;

    public StadiumsFragmentRepositoryImpl(StadiumsFragmentInteractor stadiumsFragmentInteractor) {
        this.stadiumsFragmentInteractor = stadiumsFragmentInteractor;
    }

    @Override
    public void getDataStadium() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Stadium>> groups = service.getDataStadium();
        groups.enqueue(new Callback<List<Stadium>>() {
            @Override
            public void onResponse(Call<List<Stadium>> call, Response<List<Stadium>> response) {
                stadiumList = response.body();
                stadiumsFragmentInteractor.showResultStadium(stadiumList);
            }

            @Override
            public void onFailure(Call<List<Stadium>> call, Throwable t) {
                //
            }
        });
    }
}
