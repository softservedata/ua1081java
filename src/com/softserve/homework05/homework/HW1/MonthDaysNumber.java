package com.softserve.homework05.homework.HW1;

import java.util.Scanner;

public class MonthDaysNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[][] monthDaysNumber = {
                {31, "January"},
                {28, "February"},
                {31, "March"},
                {30, "April"},
                {31, "May"},
                {30, "June"},
                {31, "July"},
                {31, "August"},
                {30, "September"},
                {31, "October"},
                {30, "November"},
                {31, "December"}};

        System.out.print("Please enter the number of the month: ");

        int monthInput = scanner.nextInt();
        int result;
        scanner.nextLine();

        try {
            String monthName = (String) monthDaysNumber[monthInput - 1][1];

            if (monthInput == 2) {
                System.out.print("Please indicate whether this is a leap year (yes / no)? ");

                switch (scanner.nextLine().toLowerCase()) {
                    case "yes":
                        result = (int) monthDaysNumber[monthInput - 1][0] + 1;
                        System.out.println(monthName + " this year contains " + result + " days.");
                        break;
                    default:
                        result = (int) monthDaysNumber[monthInput - 1][0];
                        System.out.println(monthName + " this year contains " + result + " days.");
                }
            } else {
                result = (int) monthDaysNumber[monthInput - 1][0];
                System.out.println(monthName + " contains " + result + " days.");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Such a month does not exist. Please try again!");
        }
    }
}