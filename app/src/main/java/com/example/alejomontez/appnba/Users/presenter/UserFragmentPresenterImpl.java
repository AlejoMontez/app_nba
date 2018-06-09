package com.example.alejomontez.appnba.Users.presenter;

import com.example.alejomontez.appnba.Teams.interactor.TeamFragmentInteractor;
import com.example.alejomontez.appnba.Teams.interactor.TeamFragmentInteractorImpl;
import com.example.alejomontez.appnba.Teams.view.TeamFragmentView;
import com.example.alejomontez.appnba.Users.interactor.UserFragmentInteractor;
import com.example.alejomontez.appnba.Users.interactor.UserFragmentInteractorImpl;
import com.example.alejomontez.appnba.Users.model.Users;
import com.example.alejomontez.appnba.Users.view.UserFragmentView;

import java.util.List;

public class UserFragmentPresenterImpl implements UserFragmentPresenter {


    private UserFragmentView userFragmentView;
    private UserFragmentInteractor userFragmentInteractor;

    public UserFragmentPresenterImpl(UserFragmentView userFragmentView) {
        this.userFragmentView = userFragmentView;
        userFragmentInteractor = new UserFragmentInteractorImpl(this);
    }



    @Override
    public void showResultUser(List<Users> usersList) {
        userFragmentView.showResultUser(usersList);
    }

    @Override
    public void getDataUser() {
        userFragmentInteractor.getDataUser();

    }
}
