package com.example.alejomontez.appnba.Login.presenter;

import com.example.alejomontez.appnba.Login.interactor.LoginActivityInteractor;
import com.example.alejomontez.appnba.Login.interactor.LoginActivityInteractorImpl;
import com.example.alejomontez.appnba.Login.model.Login;
import com.example.alejomontez.appnba.Login.view.LoginActivityView;

import java.util.List;

public class LoginActivityPresenterImpl implements LoginActivityPresenter {

    private LoginActivityView loginActivityView;
    private LoginActivityInteractor loginActivityInteractor;

    public LoginActivityPresenterImpl(LoginActivityView loginActivityView) {
        this.loginActivityView = loginActivityView;
        loginActivityInteractor = new LoginActivityInteractorImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        loginActivityInteractor.signIn(user, pass);
    }

    @Override
    public void showResult(List<Login> loginList) {
        loginActivityView.showResult(loginList);
    }

    @Override
    public void showError(String error) {
        loginActivityView.showError(error);
    }
}
