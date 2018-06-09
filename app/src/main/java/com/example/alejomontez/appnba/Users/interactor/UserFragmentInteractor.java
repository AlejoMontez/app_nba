package com.example.alejomontez.appnba.Users.interactor;

import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Users.model.Users;

import java.util.List;

public interface UserFragmentInteractor {

    void getDataUser();
    void showResultUser(List<Users> usersList);

}
