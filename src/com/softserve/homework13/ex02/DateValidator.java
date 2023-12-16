package com.softserve.homework13.ex02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator {
    public static void main(String[] args) {
        String pattern = "MM.dd.yy";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        try {
            LocalDate parsedDate = LocalDate.parse("11.23.99", dtf);
            System.out.printf("Your date %s is in valid format %s%n", parsedDate.format(dtf), pattern);
        } catch (DateTimeParseException e) {
            System.out.println("Your date is not in line with required format MM.dd.yy");
        }

        LocalDate date = LocalDate.of(1999, 11, 23);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.printf("Initial date: %s, formatted to %s date: %s",
                date, pattern, date.format(dateTimeFormatter));
    }
}
