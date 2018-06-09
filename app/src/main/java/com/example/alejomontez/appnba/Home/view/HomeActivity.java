package com.example.alejomontez.appnba.Home.view;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import android.support.v7.app.ActionBar;
import com.example.alejomontez.appnba.Home.presenter.HomeActivityPresenter;
import com.example.alejomontez.appnba.Home.presenter.HomeActivityPresenterImpl;
import com.example.alejomontez.appnba.Login.view.LoginActivity;
import com.example.alejomontez.appnba.Profile.view.ProfileFragment;
import com.example.alejomontez.appnba.R;
import com.example.alejomontez.appnba.Utilities.BottomNavigationViewHelper;


public class HomeActivity extends AppCompatActivity implements HomeActivityView {

    private HomeActivityPresenter homeActivityPresenter;
    BottomNavigationView bottomNavigationView, bottomNavigationView1;
    FragmentManager fragmentManager;
    SharedPreferences sharedPreferences;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //toolbar = (Toolbar) findViewById(R.id.toolbar1);
        //setSupportActionBar(toolbar);
        homeActivityPresenter = new HomeActivityPresenterImpl(this);
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bnv_index);
        bottomNavigationView1 = (BottomNavigationView) findViewById(R.id.toolbar1);


        //BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView1);
        bottomNavigationView.setSelectedItemId(R.id.id_menubn_news);
        bottomNavigationView1.setSelectedItemId(R.id.menuLookProfileList);

        fragmentManager = getSupportFragmentManager();


        initSharedPreferences();
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list_team, menu);

        return true;
    }
*/



   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                //startActivity(new Intent(this, ProfileFragment.class));
                return true;

            case R.id.item2:
                Toast.makeText(this, "Item 2 Selected", Toast.LENGTH_SHORT).show();
                return true;


        }
        return true;
    }
*/
        public void initSharedPreferences() {

            sharedPreferences = getSharedPreferences("PreferencesAppNBA", Context.MODE_PRIVATE);

            String user = sharedPreferences.getString("user", null);

            if ((user == null) || (user.equals(""))) {
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            } else {
                initBottomNavigationView();
                initBottomNavigationView1();
            }
        }

    public void initBottomNavigationView() {
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()) {
                        case R.id.id_menubn_calendar:
                            homeActivityPresenter.ChangeTab(0, fragmentManager);
                            break;
                        case R.id.id_menubn_group:
                            homeActivityPresenter.ChangeTab(1, fragmentManager);
                            break;
                        case R.id.id_menubn_news:
                            homeActivityPresenter.ChangeTab(2, fragmentManager);
                            break;
                        case R.id.id_menubn_stadium:
                            homeActivityPresenter.ChangeTab(3, fragmentManager);
                            break;
                        case R.id.id_menubn_jugadores:
                            homeActivityPresenter.ChangeTab(4, fragmentManager);
                            break;
                    }

                    return true;
                }
            });
        }


    public void initBottomNavigationView1() {
        bottomNavigationView1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.item1:
                        homeActivityPresenter.ChangeTab1(0, fragmentManager);
                        break;

                    case R.id.menuLookProfileList:
                        homeActivityPresenter.ChangeTab1(1, fragmentManager);
                        break;
                    case R.id.item2:
                        homeActivityPresenter.ChangeTab1(2, fragmentManager);
                        break;

                }

                return true;
            }
        });
    }

        @Override
        public void showResult() {

        }




}
