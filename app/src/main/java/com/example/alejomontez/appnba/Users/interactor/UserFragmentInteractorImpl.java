package com.example.alejomontez.appnba.Users.interactor;

import com.example.alejomontez.appnba.Teams.presenter.TeamFragmentPresenter;
import com.example.alejomontez.appnba.Teams.repository.TeamFragmentRepository;
import com.example.alejomontez.appnba.Teams.repository.TeamFragmentRepositoryImpl;
import com.example.alejomontez.appnba.Users.model.Users;
import com.example.alejomontez.appnba.Users.presenter.UserFragmentPresenter;
import com.example.alejomontez.appnba.Users.repository.UserFragmentRepository;
import com.example.alejomontez.appnba.Users.repository.UserFragmentRepositoryImpl;

import java.util.List;

public class UserFragmentInteractorImpl implements UserFragmentInteractor {

    private UserFragmentPresenter userFragmentPresenter;
    private UserFragmentRepository userFragmentRepository;

    public UserFragmentInteractorImpl(UserFragmentPresenter userFragmentPresenter) {
        this.userFragmentPresenter = userFragmentPresenter;
        userFragmentRepository = new UserFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataUser() {
        userFragmentRepository.getDataUser();

    }

    @Override
    public void showResultUser(List<Users> usersList) {
        userFragmentPresenter.showResultUser(usersList);

    }
}
