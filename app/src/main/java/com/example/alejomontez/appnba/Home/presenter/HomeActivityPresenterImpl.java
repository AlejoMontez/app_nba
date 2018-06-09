package com.example.alejomontez.appnba.Home.presenter;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.view.Menu;

import com.example.alejomontez.appnba.Home.interactor.HomeActivityInteractor;
import com.example.alejomontez.appnba.Home.interactor.HomeActivityInteractorImpl;
import com.example.alejomontez.appnba.Home.view.HomeActivityView;

public class HomeActivityPresenterImpl implements HomeActivityPresenter{

    private HomeActivityView homeActivityView;
    private HomeActivityInteractor homeActivityInteractor;

    public HomeActivityPresenterImpl(HomeActivityView homeActivityView) {
        this.homeActivityView = homeActivityView;
        homeActivityInteractor = new HomeActivityInteractorImpl(this);
    }

    @Override
    public void showResult() {

    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        homeActivityInteractor.ChangeTab(position, fragmentManager);
    }
    @Override
    public void ChangeTab1(Integer position, FragmentManager fragmentManager) {
        homeActivityInteractor.ChangeTab1(position, fragmentManager);
    }

}
