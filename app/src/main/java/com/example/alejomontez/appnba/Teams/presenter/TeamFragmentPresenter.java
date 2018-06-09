package com.example.alejomontez.appnba.Teams.presenter;

import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Teams.model.Teams;

import java.util.List;

public interface TeamFragmentPresenter {
    void showResultTeam(List<Teams> teamsList);
    void getDataTeam();
}
