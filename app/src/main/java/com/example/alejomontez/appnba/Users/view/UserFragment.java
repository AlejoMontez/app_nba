package com.example.alejomontez.appnba.Users.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.alejomontez.appnba.R;
import com.example.alejomontez.appnba.Teams.adapter.TeamAdapter;
import com.example.alejomontez.appnba.Teams.presenter.TeamFragmentPresenter;
import com.example.alejomontez.appnba.Teams.presenter.TeamFragmentPresenterImpl;
import com.example.alejomontez.appnba.Users.adpater.UserAdapter;
import com.example.alejomontez.appnba.Users.model.Users;
import com.example.alejomontez.appnba.Users.presenter.UserFragmentPresenter;
import com.example.alejomontez.appnba.Users.presenter.UserFragmentPresenterImpl;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class UserFragment extends Fragment implements UserFragmentView{



    private UserFragmentPresenter userFragmentPresenter;
    ProgressBar progressBarUser;
    RecyclerView recyclerViewUser;

    public UserFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);

        progressBarUser = (ProgressBar) view.findViewById(R.id.id_pgb_user);
        recyclerViewUser = (RecyclerView) view.findViewById(R.id.id_rcv_user);
        recyclerViewUser.setLayoutManager(new LinearLayoutManager(getContext()));

        userFragmentPresenter = new UserFragmentPresenterImpl(this) {
        };

        progressBarUser.setVisibility(View.VISIBLE);
        userFragmentPresenter.getDataUser();

        return view;
    }

    @Override
    public void showResultUser(List<Users> usersList) {
        progressBarUser.setVisibility(View.GONE);
        recyclerViewUser.setAdapter(new UserAdapter(usersList, getContext()));
    }
}
