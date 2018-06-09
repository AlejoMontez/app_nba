package com.example.alejomontez.appnba.Teams.interactor;

import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Teams.model.Teams;

import java.util.List;

public interface TeamFragmentInteractor {

    void getDataTeam();
    void showResultTeam(List<Teams> teamsList);
}
