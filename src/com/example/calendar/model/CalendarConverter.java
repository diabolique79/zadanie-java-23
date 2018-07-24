package com.example.calendar.model;

public class CalendarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;



    public static String convertDayToString(int dayNumber){

        String result;

        switch (dayNumber){

            case MONDAY:
                result = "Poniedziałek";
                break;
            case TUESDAY:
                result="Wtorek";
                break;
            case WEDNESDAY:
                result = "Środa";
                break;
            case THURSDAY:
                result = "Czwartek";
                break;
            case FRIDAY:
                result = "Piątek";
                break;
            case SATURDAY:
                result = "Sobota";
                break;
            case SUNDAY:
                result = "Niedziela";
                break;
                default:
                    result = "Błąd";

        }

return result;

    }
}
