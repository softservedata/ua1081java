package com.softserve.homework13.practicaltask;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class FirstMondayDate {
    public static void main(String[] args) {
        LocalDate firstMonday = LocalDate.now().with(firstInMonth(DayOfWeek.MONDAY));
        String formattedDate = DateTimeFormatter.ofPattern("dd.MM.yyyy").format(firstMonday);
        System.out.println("The date of the first Monday of this month: " + formattedDate + ".");
    }
}
