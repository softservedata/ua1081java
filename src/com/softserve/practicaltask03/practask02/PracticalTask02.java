package com.softserve.practicaltask03.practask02;

import com.softserve.homework03.task03.HttpError;

import java.util.Scanner;

public class PracticalTask02 {
    static Scanner scanner = new Scanner(System.in);
    public static void displayNameOfDayOfWeek() {
        System.out.println("Enter number of the day of the week (1-7)");
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println(Week.MONDAY);
        } else if (num == 2) {
            System.out.println(Week.TUESDAY);
        } else if (num == 3) {
            System.out.println(Week.WEDNESDAY);
        } else if (num == 4) {
            System.out.println(Week.THURSDAY);
        } else if (num == 5) {
            System.out.println(Week.FRIDAY);
        } else if (num == 6) {
            System.out.println(Week.SATURDAY);
        } else if (num == 7) {
            System.out.println(Week.SUNDAY);
        } else {
            System.out.println("You entered incorrect data");
        }
    }
}
