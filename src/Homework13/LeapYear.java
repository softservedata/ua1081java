package Homework13;

import java.util.Scanner;

public class LeapYear {
    private static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        if (leapYear(year)) {
            System.out.println(year + " is a leap Year.");
        } else {
            System.out.println(year + " is not a leap Year.");
        }
        scanner.close();
    }
}
