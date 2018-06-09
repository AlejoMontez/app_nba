package com.example.alejomontez.appnba.Home.interactor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.alejomontez.appnba.Information.InformationFragment;
import com.example.alejomontez.appnba.Match.view.CalendarFragment;
import com.example.alejomontez.appnba.Groups.view.GroupFragment;

import com.example.alejomontez.appnba.Players.view.PlayerFragment;

import com.example.alejomontez.appnba.Profile.view.ProfileFragment;
import com.example.alejomontez.appnba.R;

import com.example.alejomontez.appnba.Home.presenter.HomeActivityPresenter;
import com.example.alejomontez.appnba.Stadiums.view.StadiumsFragment;
import com.example.alejomontez.appnba.Teams.view.TeamFragment;
import com.example.alejomontez.appnba.Users.view.UserFragment;

public class HomeActivityInteractorImpl implements HomeActivityInteractor{

    private HomeActivityPresenter homeActivityPresenter;

    public HomeActivityInteractorImpl(HomeActivityPresenter homeActivityPresenter) {
        this.homeActivityPresenter = homeActivityPresenter;
    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        switch (position){
            case 0:
                StadiumsFragment stadiumsFragment = new StadiumsFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, stadiumsFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;

            case 1:
                PlayerFragment playerFragment = new PlayerFragment();

                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, playerFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;

            case 2:
                TeamFragment teamFragment = new TeamFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, teamFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 3:
                CalendarFragment calendarFragment = new CalendarFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, calendarFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;
            case 4:
                GroupFragment groupFragment = new GroupFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, groupFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;


        }
    }


    @Override
    public void ChangeTab1(Integer position, FragmentManager fragmentManager) {
        switch (position){
            case 0:
                //PlayerFragment playerFragment = new PlayerFragment();
                UserFragment userFragment = new UserFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, userFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;

            case 1:


            //StadiumsFragment stadiumsFragment = new StadiumsFragment();
            ProfileFragment profileFragment = new ProfileFragment();
            fragmentManager
                    .beginTransaction()
                    .replace(R.id.id_fl_index, profileFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .addToBackStack(null)
                    .commit();
            break;
            case 2:


                //StadiumsFragment stadiumsFragment = new StadiumsFragment();
                //ProfileFragment profileFragment = new ProfileFragment();
                InformationFragment informationFragment = new InformationFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, informationFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;


        }
    }
}
