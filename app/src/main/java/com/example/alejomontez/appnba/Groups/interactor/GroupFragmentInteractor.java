package com.example.alejomontez.appnba.Groups.interactor;

import com.example.alejomontez.appnba.Groups.model.Group;

import java.util.List;

public interface GroupFragmentInteractor {
    void getDataGroup();
    void showResultGroups(List<Group> calendarList);
}
