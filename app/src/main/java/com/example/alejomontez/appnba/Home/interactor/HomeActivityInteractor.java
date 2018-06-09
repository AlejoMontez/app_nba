package com.example.alejomontez.appnba.Home.interactor;

import android.content.Context;
import android.support.v4.app.FragmentManager;

public interface HomeActivityInteractor {
    void ChangeTab(Integer position, FragmentManager fragmentManager);
    void ChangeTab1(Integer position, FragmentManager fragmentManager);
}
