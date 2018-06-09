package com.example.alejomontez.appnba.Stadiums.presenter;

import com.example.alejomontez.appnba.Stadiums.interactor.StadiumsFragmentInteractor;
import com.example.alejomontez.appnba.Stadiums.interactor.StadiumsFragmentInteractorImpl;
import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Stadiums.view.StadiumsFragmentView;

import java.util.List;

public class StadiumsFragmentPresenterImpl implements StadiumsFragmentPresenter {

    private StadiumsFragmentView stadiumsFragmentView;
    private StadiumsFragmentInteractor stadiumsFragmentInteractor;

    public StadiumsFragmentPresenterImpl(StadiumsFragmentView stadiumsFragmentView) {
        this.stadiumsFragmentView = stadiumsFragmentView;
        stadiumsFragmentInteractor = new StadiumsFragmentInteractorImpl(this);
    }

    @Override
    public void showResultStadium(List<Stadium> stadiumList) {
        stadiumsFragmentView.showResultStadium(stadiumList);
    }

    @Override
    public void getDataStadium() {

        stadiumsFragmentInteractor.getDataStadium();
    }
}
