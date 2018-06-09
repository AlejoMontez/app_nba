package com.example.alejomontez.appnba.Groups.presenter;

import com.example.alejomontez.appnba.Groups.interactor.GroupFragmentInteractor;
import com.example.alejomontez.appnba.Groups.interactor.GroupFragmentInteractorImpl;
import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.Groups.view.GroupFragmentView;

import java.util.List;

public class GroupFragmentPresenterImpl implements GroupFragmentPresenter {

    private GroupFragmentView groupFragmentView;
    private GroupFragmentInteractor groupFragmentInteractor;

    public GroupFragmentPresenterImpl(GroupFragmentView groupFragmentView) {
        this.groupFragmentView = groupFragmentView;
        groupFragmentInteractor = new GroupFragmentInteractorImpl(this);
    }

    @Override
    public void showResultGroups(List<Group> calendarList) {
        groupFragmentView.showResultGroups(calendarList);
    }

    @Override
    public void getDataGroup() {
        groupFragmentInteractor.getDataGroup();
    }
}
