package com.example.alejomontez.appnba.Users.presenter;

import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Users.model.Users;

import java.util.List;

public interface UserFragmentPresenter {
    void showResultUser(List<Users> usersList);
    void getDataUser();
}
