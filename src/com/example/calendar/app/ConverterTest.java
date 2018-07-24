package com.example.calendar.app;

import com.example.calendar.model.CalendarConverter;

public class ConverterTest {

    public static void main(String[] args) {

        for (int i = 1; i <=7; i++){

            System.out.println(i + " dzień tygodnia to "+ CalendarConverter.convertDayToString(i));

        }

    }
}
