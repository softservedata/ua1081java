package com.softserve.edu.lesson_12_functInterfaceAndDate.homework.hw_2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        System.out.println(date.format(dateTimeFormatter));
    }
}
