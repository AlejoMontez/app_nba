package com.example.alejomontez.appnba.Login.interactor;

import com.example.alejomontez.appnba.Login.model.Login;
import com.example.alejomontez.appnba.Login.presenter.LoginActivityPresenter;
import com.example.alejomontez.appnba.Login.repository.LoginActivityRepository;
import com.example.alejomontez.appnba.Login.repository.LoginActivityRepositoryImpl;

import java.util.List;

public class LoginActivityInteractorImpl implements LoginActivityInteractor {

    private LoginActivityPresenter loginActivityPresenter;
    private LoginActivityRepository loginActivityRepository;

    public LoginActivityInteractorImpl(LoginActivityPresenter loginActivityPresenter) {
        this.loginActivityPresenter = loginActivityPresenter;
        loginActivityRepository = new LoginActivityRepositoryImpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        if ("".equals(user) || "".equals(pass)){
            loginActivityPresenter.showError("Los campos no pueden estar vacios");
        }else {
            loginActivityRepository.signIn(user, pass);
        }
    }

    @Override
    public void processData(List<Login> loginList) {
        Boolean searchUser = loginList.get(0).isSearchUser();

        if (searchUser){
            loginActivityPresenter.showResult(loginList);
        }else{
            loginActivityPresenter.showError("El usuario ingresado no existe");
        }
    }
}
