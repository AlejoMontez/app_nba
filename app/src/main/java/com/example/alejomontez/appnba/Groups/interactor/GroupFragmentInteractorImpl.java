package com.example.alejomontez.appnba.Groups.interactor;

import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.Groups.presenter.GroupFragmentPresenter;
import com.example.alejomontez.appnba.Groups.repository.GroupFragmentRepository;
import com.example.alejomontez.appnba.Groups.repository.GroupFragmentRepositoryImpl;

import java.util.List;

public class GroupFragmentInteractorImpl implements GroupFragmentInteractor {

    private GroupFragmentPresenter groupFragmentPresenter;
    private GroupFragmentRepository groupFragmentRepository;

    public GroupFragmentInteractorImpl(GroupFragmentPresenter groupFragmentPresenter) {
        this.groupFragmentPresenter = groupFragmentPresenter;
        groupFragmentRepository = new GroupFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataGroup() {

        groupFragmentRepository.getDataGroup();
    }

    @Override
    public void showResultGroups(List<Group> calendarList) {
        groupFragmentPresenter.showResultGroups(calendarList);
    }
}
