package com.example.alejomontez.appnba.Match.interactor;

import com.example.alejomontez.appnba.Match.model.Calendar;
import com.example.alejomontez.appnba.Match.presenter.CalendarFragmentPresenter;
import com.example.alejomontez.appnba.Match.repository.CalendarFragmentRepository;
import com.example.alejomontez.appnba.Match.repository.CalendarFragmentRepositoryImpl;

import java.util.List;

public class CalendarFragmentInteractorImpl implements CalendarFragmentInteractor {

    private CalendarFragmentPresenter calendarFragmentPresenter;
    private CalendarFragmentRepository calendarFragmentRepository;

    public CalendarFragmentInteractorImpl(CalendarFragmentPresenter calendarFragmentPresenter) {
        this.calendarFragmentPresenter = calendarFragmentPresenter;
        calendarFragmentRepository = new CalendarFragmentRepositoryImpl(this);
    }

    @Override
    public void getDataCalendar() {
        calendarFragmentRepository.getDataCalendar();
    }

    @Override
    public void showResultCelendar(List<Calendar> calendarList) {
        calendarFragmentPresenter.showResultCelendar(calendarList);
    }
}
