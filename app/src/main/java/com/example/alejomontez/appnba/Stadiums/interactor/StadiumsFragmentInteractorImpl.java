package com.example.alejomontez.appnba.Stadiums.interactor;

import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Stadiums.presenter.StadiumsFragmentPresenter;
import com.example.alejomontez.appnba.Stadiums.repository.StadiumsFragmentRepository;
import com.example.alejomontez.appnba.Stadiums.repository.StadiumsFragmentRepositoryImpl;

import java.util.List;

public class StadiumsFragmentInteractorImpl implements StadiumsFragmentInteractor {

    private StadiumsFragmentPresenter stadiumsFragmentPresenter;
    private StadiumsFragmentRepository stadiumsFragmentRepository;

    public StadiumsFragmentInteractorImpl(StadiumsFragmentPresenter stadiumsFragmentPresenter) {
        this.stadiumsFragmentPresenter = stadiumsFragmentPresenter;
        stadiumsFragmentRepository = new StadiumsFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataStadium() {
        stadiumsFragmentRepository.getDataStadium();
    }

    @Override
    public void showResultStadium(List<Stadium> stadiumList) {
        stadiumsFragmentPresenter.showResultStadium(stadiumList);
    }
}
