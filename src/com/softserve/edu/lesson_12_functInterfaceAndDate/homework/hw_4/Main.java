package com.softserve.edu.lesson_12_functInterfaceAndDate.homework.hw_4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1995, Month.OCTOBER, 17);
        dayWeek(birthday);

    }
    static void dayWeek(LocalDate a){
        DayOfWeek dayOfWeek = a.getDayOfWeek();
        System.out.println("Day of week "  + dayOfWeek);

        DayOfWeek dayOfWeekAfter6Months = a.plusMonths(6).getDayOfWeek();
        System.out.println("Day of week after 6 months " + dayOfWeekAfter6Months);

        DayOfWeek dayOfWeekAfter12Months = a.plusMonths(12).getDayOfWeek();
        System.out.println("Day of week after 12 months " + dayOfWeekAfter12Months);




    }
}
