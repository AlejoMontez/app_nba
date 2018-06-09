package com.example.alejomontez.appnba.Groups.presenter;

import com.example.alejomontez.appnba.Groups.model.Group;

import java.util.List;

public interface GroupFragmentPresenter {
    void showResultGroups(List<Group> calendarList);
    void getDataGroup();
}
