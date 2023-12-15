package com.softserve.HomeWorks.Homework05Ex1;

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = scanner.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month >= 1 && month <= 12) {
            System.out.println("Number of days in month " + month + ": " + daysInMonth[month]);
        } else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}

