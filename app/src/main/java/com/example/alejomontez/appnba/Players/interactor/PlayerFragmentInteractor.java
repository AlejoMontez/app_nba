package com.example.alejomontez.appnba.Players.interactor;

import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.Players.model.Players;

import java.util.List;

public interface PlayerFragmentInteractor {

    void showResultPlayer(List<Players> playersList);
    void getDataPlayer();
}
