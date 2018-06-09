package com.example.alejomontez.appnba.Match.interactor;

import com.example.alejomontez.appnba.Match.model.Calendar;

import java.util.List;

public interface CalendarFragmentInteractor {
    void getDataCalendar();
    void showResultCelendar(List<Calendar> calendarList);
}
