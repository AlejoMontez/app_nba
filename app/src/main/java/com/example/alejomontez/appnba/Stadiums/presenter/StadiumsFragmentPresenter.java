package com.example.alejomontez.appnba.Stadiums.presenter;

import com.example.alejomontez.appnba.Stadiums.model.Stadium;

import java.util.List;

public interface StadiumsFragmentPresenter {
    void showResultStadium(List<Stadium> stadiumList);
    void getDataStadium();
}
