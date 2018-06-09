package com.example.alejomontez.appnba.Match.presenter;

import com.example.alejomontez.appnba.Match.interactor.CalendarFragmentInteractor;
import com.example.alejomontez.appnba.Match.interactor.CalendarFragmentInteractorImpl;
import com.example.alejomontez.appnba.Match.model.Calendar;
import com.example.alejomontez.appnba.Match.view.CalendarFragmentView;

import java.util.List;

public class CalendarFragmentPresenterImpl implements CalendarFragmentPresenter {

    private CalendarFragmentView calendarFragmentView;
    private CalendarFragmentInteractor calendarFragmentInteractor;

    public CalendarFragmentPresenterImpl(CalendarFragmentView calendarFragmentView) {
        this.calendarFragmentView = calendarFragmentView;
        calendarFragmentInteractor = new CalendarFragmentInteractorImpl(this);
    }

    @Override
    public void showResultCelendar(List<Calendar> calendarList) {
        calendarFragmentView.showResultCelendar(calendarList);
    }

    @Override
    public void getDataCalendar() {
        calendarFragmentInteractor.getDataCalendar();
    }
}
