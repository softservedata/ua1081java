package com.softserve.edu.lesson_4_Arrays.homework.hw_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            int day = days[month];
            System.out.println("Days in selected month " + day);
        } else {
            System.out.println("Please select correct month number");
        }
    }
}
//your code is correct, but you can improve it
//I suggest you to use try-with-resources statement
//and add check for leap year
class MonthDaysNew {
    public static void main(String[] args) {
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = new String[]{"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter month number (1-12):");
            int month = sc.nextInt();

            if (month >= 1 && month <= 12) {
                int day = days[month];

                if (month == 2) {
                    System.out.println("Enter year:");
                    int year = sc.nextInt();
                    if (isLeapYear(year)) {
                        day++;
                    }
                }
                System.out.println("Days in " + months[month] + ": " + day);
            } else {
                System.out.println("Please select a correct month number (1-12)");
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer.");
        }
    }

    /**
     * Method checks if year is leap
     * @param year
     * @return
     */
    private static boolean isLeapYear(int year) {
      return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

    }
}