package br.com.digitalhouse.exerciciosSpring.dataprovider.repository;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AgeRepositoryFake {

    public static int calculateAgeFrom(int day, int month, int year) { return calculateAge(day, month, year);}
    private static int calculateAge(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentDay = calendar.get(Calendar.DATE);

        int age = currentYear - year;

        if(currentMonth < month){
            --age;
        }
        else if(currentMonth == month){
            if(currentDay < day){
                --age;
            }
        }

        return age;
    }

}
