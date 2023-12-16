package com.softserve.homework13.ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class YearOperations {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1990, 5, 31);
        determineDayOfWeek(birthday);
    }

    static void determineDayOfWeek(LocalDate date) {
        String current = formatter(date.getDayOfWeek());
        String sixMonthAfter = formatter(date.plusMonths(6).getDayOfWeek());
        String twelveMonthAfter = formatter(date.plusMonths(12).getDayOfWeek());

        System.out.printf("Day of the week on %s was %s%n",
                date, current);
        System.out.printf("Day of the week 6 months after %s (%s) was %s%n",
                date, date.plusMonths(6), sixMonthAfter);
        System.out.printf("Day of the week 12 months after %s (%s) was %s%n",
                date, date.plusMonths(12), twelveMonthAfter);
    }

    static String formatter(DayOfWeek day) {
        return day.toString().charAt(0) + day.toString().substring(1).toLowerCase();
    }
}
