package com.example.alejomontez.appnba.Login.presenter;

import com.example.alejomontez.appnba.Login.model.Login;

import java.util.List;

public interface LoginActivityPresenter {
    void signIn(String user, String pass);
    void showResult(List<Login> loginList);
    void showError(String error);
}
