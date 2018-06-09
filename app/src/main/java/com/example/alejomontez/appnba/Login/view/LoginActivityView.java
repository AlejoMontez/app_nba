package com.example.alejomontez.appnba.Login.view;

import com.example.alejomontez.appnba.Login.model.Login;

import java.util.List;

public interface LoginActivityView {
    void showResult(List<Login> loginList);
    void showError(String error);
}
