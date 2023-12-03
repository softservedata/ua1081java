package com.softserve.homework13.practicaltask;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CurrentWeekDay {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println("Today is " + dayOfWeek.toString().toLowerCase() + ".");
    }
}
