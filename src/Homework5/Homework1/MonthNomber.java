package Homework5.Homework1;

import java.util.Scanner;

public class MonthNomber {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a month number(1-12): ");
        int monthNumber = scanner.nextInt();
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("Number of days in month " + monthNumber + ": " + daysInMonth[monthNumber]);
        } else {
            System.out.println("Invalid month number.");
        }
    }
}
