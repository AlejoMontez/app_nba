package com.example.alejomontez.appnba.Match.repository;

import com.example.alejomontez.appnba.ApiRest.RestApiAdapter;
import com.example.alejomontez.appnba.ApiRest.Service;
import com.example.alejomontez.appnba.Match.interactor.CalendarFragmentInteractor;
import com.example.alejomontez.appnba.Match.model.Calendar;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CalendarFragmentRepositoryImpl implements CalendarFragmentRepository {

    private CalendarFragmentInteractor calendarFragmentInteractor;
    List<Calendar> calendarList;

    public CalendarFragmentRepositoryImpl(CalendarFragmentInteractor calendarFragmentInteractor) {
        this.calendarFragmentInteractor = calendarFragmentInteractor;
    }

    @Override
    public void getDataCalendar() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Calendar>> matchs = service.getDataCalendar();
        matchs.enqueue(new Callback<List<Calendar>>() {
            @Override
            public void onResponse(Call<List<Calendar>> call, Response<List<Calendar>> response) {
                calendarList = response.body();
                calendarFragmentInteractor.showResultCelendar(calendarList);

                //String json = new Gson().toJson(calendarList);
                //Log.d("CalendarGet", json);

                //for (Calendar i:calendarList) {
                //System.out.println("\n"+i.getMatchs());
                //Log.d("post", i.getTitle());
                //}
            }

            @Override
            public void onFailure(Call<List<Calendar>> call, Throwable t) {
                //
            }
        });
    }
}
