package com.softserve.edu.lesson_12_functInterfaceAndDate.practice.practice_2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate first = localDate.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(first);
    }
}
