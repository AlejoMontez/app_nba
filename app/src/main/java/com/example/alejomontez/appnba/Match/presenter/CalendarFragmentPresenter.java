package com.example.alejomontez.appnba.Match.presenter;

import com.example.alejomontez.appnba.Match.model.Calendar;

import java.util.List;

public interface CalendarFragmentPresenter {
    void showResultCelendar(List<Calendar> calendarList);
    void getDataCalendar();
}
