package com.example.alejomontez.appnba.Stadiums.interactor;

import com.example.alejomontez.appnba.Stadiums.model.Stadium;

import java.util.List;

public interface StadiumsFragmentInteractor {
    void getDataStadium();
    void showResultStadium(List<Stadium> stadiumList);
}
