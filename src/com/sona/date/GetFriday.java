package com.sona.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;


public class GetFriday {
    public static void main(String[] args) {
        new GetFriday().lastAndNextFriday();
    }

    private void lastAndNextFriday() {

        DayOfWeek today = LocalDate.now().getDayOfWeek();
        int addDayCount = 0;
        int subDayCount = 0;
        switch (today) {
            case MONDAY:
                addDayCount = 4;
                subDayCount = 3;
                break;
            case TUESDAY:
                addDayCount = 3;
                subDayCount = 4;
                break;
            case WEDNESDAY:
                addDayCount = 2;
                subDayCount = 5;
                break;
            case THURSDAY:
                addDayCount = 1;
                subDayCount = 6;
                break;
            case FRIDAY:
                addDayCount = 7;
                subDayCount = 7;
                break;
            case SATURDAY:
                addDayCount = 6;
                subDayCount = 1;
                break;
            case SUNDAY:
                addDayCount = 5;
                subDayCount = 2;
                break;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, addDayCount);
        System.out.println("Next friday is " + calendar.getTime());
        calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -subDayCount);
        System.out.println("Last friday is " + calendar.getTime());
    }
}




