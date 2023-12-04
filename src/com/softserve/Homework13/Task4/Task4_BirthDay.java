package com.softserve.Homework13.Task4;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Task4_BirthDay {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2004, Month.MAY,26);
        print(localDate);

    }
    public static void print(LocalDate localDate){
        System.out.print(" The day of the week after 6 months: "+localDate.plusMonths(6).getDayOfWeek());
        System.out.print("\n The day of the week after 12 months: "+localDate.plusMonths(12).getDayOfWeek());
    }
}
