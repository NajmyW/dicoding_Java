package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleCalendar {
    public static void main(String[] args){
        Calendar calender = Calendar.getInstance();
        System.out.println("Waktu sekarang adalah " + calender.getTime());
    }
}
