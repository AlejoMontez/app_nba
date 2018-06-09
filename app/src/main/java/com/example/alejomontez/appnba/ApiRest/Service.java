package com.example.alejomontez.appnba.ApiRest;

import com.example.alejomontez.appnba.Match.model.Calendar;
import com.example.alejomontez.appnba.CreateAccount.model.Account;
import com.example.alejomontez.appnba.Groups.model.Group;
import com.example.alejomontez.appnba.Login.model.Login;
import com.example.alejomontez.appnba.Players.model.Players;
import com.example.alejomontez.appnba.Stadiums.model.Stadium;
import com.example.alejomontez.appnba.Teams.model.Teams;
import com.example.alejomontez.appnba.Users.model.Users;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service {
    @POST(Constants.URL_POST_LOGIN)
    @FormUrlEncoded
    Call<List<Login>> onSignIn(@Field("user") String user, @Field("pass") String pass);

    @POST(Constants.URL_POST_SIGNUP)
    @FormUrlEncoded
    Call<List<Account>> onSignUp(
            @Field("user") String user,
            @Field("pass") String pass,
            @Field("name") String name,
            @Field("email") String email
    );

    @GET(Constants.URL_GET_CALENDAR)
    Call<List<Calendar>> getDataCalendar();

    @GET(Constants.URL_GET_GROUP)
    Call<List<Group>> getDataGroup();

    @GET(Constants.URL_GET_PLAYERS)
    Call<List<Players>> getDataPlayer();

    @GET(Constants.URL_GET_STADIUM)
    Call<List<Stadium>> getDataStadium();

    @GET(Constants.URL_GET_TEAMS)
    Call<List<Teams>> getDataTeam();

    @GET(Constants.URL_GET_USERS)
    Call<List<Users>> getDataUser();
}
