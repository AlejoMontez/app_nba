package com.example.alejomontez.appnba.Players.presenter;

import com.example.alejomontez.appnba.Groups.interactor.GroupFragmentInteractor;
import com.example.alejomontez.appnba.Groups.interactor.GroupFragmentInteractorImpl;
import com.example.alejomontez.appnba.Groups.view.GroupFragmentView;
import com.example.alejomontez.appnba.Players.interactor.PlayerFragmentInteractor;
import com.example.alejomontez.appnba.Players.interactor.PlayerFragmentInteractorImpl;
import com.example.alejomontez.appnba.Players.model.Players;
import com.example.alejomontez.appnba.Players.view.PlayerFragmentView;

import java.util.List;

public class PlayerFragmentPresenterImpl implements PlayerFragmentPresenter {

    private PlayerFragmentView playerFragmentView;
    private PlayerFragmentInteractor playerFragmentInteractor;

    public PlayerFragmentPresenterImpl(PlayerFragmentView playerFragmentView) {
        this.playerFragmentView = playerFragmentView;
        playerFragmentInteractor = new PlayerFragmentInteractorImpl(this);
    }

    @Override
    public void showResultPlayer(List<Players> playersList) {
        playerFragmentView.showResultPlayer(playersList);
    }

    @Override
    public void getDataPlayer() {
        playerFragmentInteractor.getDataPlayer();
    }
}
