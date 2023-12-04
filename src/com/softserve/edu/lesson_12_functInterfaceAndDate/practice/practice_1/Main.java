package com.softserve.edu.lesson_12_functInterfaceAndDate.practice.practice_1;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek());
    }
}
