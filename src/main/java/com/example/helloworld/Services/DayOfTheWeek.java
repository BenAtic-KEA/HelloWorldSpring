package com.example.helloworld.Services;

import java.util.Date;

public class DayOfTheWeek {


    private int tempNumber(int day, int month, int year){
        Date date = new Date();
        int h;
        //int day = 31; //date.getDay();
        //int month = 8; //date.getMonth();
        //int year = 2020; //date.getYear();
        int century = year/100;
        int yearOfTheCentury = year%100;

        h = (day + ((13*(month+1))/5) + yearOfTheCentury + (yearOfTheCentury/4) + ( century/4) - (2*century))%7;

        return h;
    }

    public int dayOfTheWeek(int day, int month, int year){
        int d;
        int tempNumber = tempNumber(day,month,year);

        d = ((tempNumber+5)%7) + 1;
        return d;
    }

    /*
    h= (q+b13(m+ 1)5c+k+bk4c+bj4c−2j)%7

    h is a temporary variable
    q is the day of the month (1-31)
    m is the month (1-12)
    j is the century:  year/100
    k is the year of the century:  year%100

     */
}
