package com.example.alejomontez.appnba.Login.interactor;

import com.example.alejomontez.appnba.Login.model.Login;

import java.util.List;

public interface LoginActivityInteractor {
    void signIn(String user, String pass);
    void processData(List<Login> loginList);
}
