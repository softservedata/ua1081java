package com.softserve.homework13.ex03;

import java.time.LocalDate;

public class LeapYear {

    public static void main(String[] args) {
        try {
            System.out.println(isLeapYear("2000"));
        } catch (NumberFormatException e) {
            System.out.println("Data in invalid format has been input");;
        } catch (IllegalArgumentException e) {
            System.out.println("Year before implementation of leap year has been input");
        }

        try {
            System.out.println(isLeapYear(2000));
        } catch (IllegalArgumentException e) {
            System.out.println("Year before implementation of leap year has been input");
        }
    }

    static boolean isLeapYear(String year) throws IllegalArgumentException {
        LocalDate date = null;
        if (Integer.parseInt(year) < 8) {
            throw new IllegalArgumentException("Leap years were started in current way in year 8 AD");
        }
        date = LocalDate.of(Integer.parseInt(year), 1, 1);
        return date.isLeapYear();
    }

    static boolean isLeapYear(int year) throws IllegalArgumentException {
        if (year < 8) {
            throw new IllegalArgumentException("Leap years were started in current way in year 8 AD");
        }
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.isLeapYear();
    }
}
