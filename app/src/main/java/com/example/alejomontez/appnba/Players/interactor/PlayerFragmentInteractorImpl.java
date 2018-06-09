package com.example.alejomontez.appnba.Players.interactor;

import com.example.alejomontez.appnba.Groups.presenter.GroupFragmentPresenter;
import com.example.alejomontez.appnba.Groups.repository.GroupFragmentRepository;
import com.example.alejomontez.appnba.Groups.repository.GroupFragmentRepositoryImpl;
import com.example.alejomontez.appnba.Players.model.Players;
import com.example.alejomontez.appnba.Players.presenter.PlayerFragmentPresenter;
import com.example.alejomontez.appnba.Players.repository.PlayerFragmentRepository;
import com.example.alejomontez.appnba.Players.repository.PlayerFragmentRepositoryImpl;

import java.util.List;

public class PlayerFragmentInteractorImpl implements PlayerFragmentInteractor {


    private PlayerFragmentPresenter playerFragmentPresenter;
    private PlayerFragmentRepository playerFragmentRepository;

    public PlayerFragmentInteractorImpl(PlayerFragmentPresenter playerFragmentPresenter) {
        this.playerFragmentPresenter = playerFragmentPresenter;
        playerFragmentRepository = new PlayerFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataPlayer() {

        playerFragmentRepository.getDataPlayer();
    }

    @Override
    public void showResultPlayer(List<Players> playersList) {

        playerFragmentPresenter.showResultPlayer(playersList);

    }
}
