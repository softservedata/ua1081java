package com.softserve.homework13.homework;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthDayOperations {

    public static void birthdayRelatedWeekDays(LocalDate birthday) {
        DayOfWeek dayOfWeek = birthday.getDayOfWeek();
        DayOfWeek dayOfWeekAfterSixMonths = birthday.plus(6, ChronoUnit.MONTHS).getDayOfWeek();
        DayOfWeek dayOfWeekAfterTwelveMonths = birthday.plusMonths(12).getDayOfWeek();


        System.out.println("My birthday was on " + dayOfWeek.toString().toLowerCase() + ".\n" +
                "In six months it was " + dayOfWeekAfterSixMonths.toString().toLowerCase() + ".\n" +
                "In twelve months it was " + dayOfWeekAfterTwelveMonths.toString().toLowerCase() + ".");
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1987, 10, 26);
        birthdayRelatedWeekDays(birthday);
    }
}
