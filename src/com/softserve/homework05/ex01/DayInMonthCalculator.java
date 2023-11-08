package com.softserve.homework05.ex01;

import java.time.Month;
import java.util.Scanner;

public class DayInMonthCalculator {
    boolean isLeapYear;
    static Scanner sc = new Scanner(System.in);

    public DayInMonthCalculator(boolean isLeapYear) {
        this.isLeapYear = isLeapYear;
    }

    public int[] createDaysInMonthsArray() {
        int[] daysInMonths = {Month.JANUARY.length(isLeapYear), Month.FEBRUARY.length(isLeapYear),
                Month.MARCH.length(isLeapYear), Month.APRIL.length(isLeapYear), Month.MAY.length(isLeapYear),
                Month.JUNE.length(isLeapYear), Month.JULY.length(isLeapYear), Month.AUGUST.length(isLeapYear),
                Month.SEPTEMBER.length(isLeapYear), Month.OCTOBER.length(isLeapYear),
                Month.NOVEMBER.length(isLeapYear), Month.DECEMBER.length(isLeapYear)};
        return daysInMonths;
    } //array is filled in such way to enable flexibility for February in leap year

    public static void main(String[] args) {
        DayInMonthCalculator dayInMonthCalculator = new DayInMonthCalculator(false);
        int[] daysInMonth = dayInMonthCalculator.createDaysInMonthsArray();
        int input;

        System.out.println("Please, input the number of a month: ");
        if (sc.hasNextInt()) {
            input = sc.nextInt();
            if (input >= 1 && input <= 12) {
                System.out.printf("Days in month number %s (%s) is %s", input, Month.of(input), daysInMonth[input - 1]);
            } else {
                System.out.println("Please, input month number from 1 to 12");
            }
        } else {
            System.out.println("Please, input integer value from 1 to 12");
        }
    }
}
