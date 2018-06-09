package com.example.alejomontez.appnba.Home.presenter;

import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.view.Menu;

public interface HomeActivityPresenter {
    void showResult();
    void ChangeTab(Integer position, FragmentManager fragmentManager);
    void ChangeTab1(Integer position, FragmentManager fragmentManager);

}
