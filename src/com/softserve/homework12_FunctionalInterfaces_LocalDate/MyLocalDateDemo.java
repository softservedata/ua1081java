package com.softserve.homework12_FunctionalInterfaces_LocalDate;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class MyLocalDateDemo {
    public static void main(String[] args) {
//        Task 02 Create method to validate date according to format "mm.dd.yy"

        String validDate = "12.04.23";
        String invalidDate = "13.32.99";
        if(checkDate(validDate)){
            System.out.println("This date " + validDate + "  is valid ");
        }else {
            System.out.println("This date " + validDate + "  is invalid ");
        }

//        Task 03 Create method which take year as a parameter and return true if year is a leap

        int leapYear = 2020;
        int notLeapYear = 2021;
        System.out.println(leapYear + " is a leap year? " + isLeapYear(leapYear));
        System.out.println(notLeapYear + " is a leap year? " + isLeapYear(notLeapYear));

//        Task 04  Create variable LocalDate birthday and set to that variable date your birthday.
//        Create method that take as a parameter object LocalDate and pring the day of the week
//        and what was the day of the week after 6 months and what was the day of the week after
//        12 months.

        LocalDate birthDay = LocalDate.of(1993, Month.AUGUST, 31);
        printDayOfWeekByDate(birthDay);


    }

    public static boolean checkDate(String dateString) {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(dateString, dateFormatter);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printDayOfWeekByDate(LocalDate localDate) {
        System.out.println("Day of week my birthday is " + localDate.getDayOfWeek());
        Period period1 = Period.of(0, 6, 0);
        LocalDate newDateAfter6Month = localDate.plus(period1);
        System.out.println(newDateAfter6Month + "  getDayOfWeek() after 6 month = " + newDateAfter6Month.getDayOfWeek());
        Period period2 = Period.of(0, 12, 0);
        LocalDate newDateAfter12Month = localDate.plus(period2);
        System.out.println(newDateAfter12Month + "  getDayOfWeek() after 12 month = " + newDateAfter6Month.getDayOfWeek());
    }


}
