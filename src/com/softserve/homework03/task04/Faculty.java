package com.softserve.homework03.task04;

import java.util.Scanner;

public class Faculty {
    static Scanner scanner = new Scanner(System.in);

    public static void enterNumberOfStudents() {
        System.out.println("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter current season (Winter, Spring, Summer, Autumn): ");
        String currentSeason = scanner.nextLine().toUpperCase();
        if (currentSeason.equals(Season.WINTER.getCurrentSeason())) {
            System.out.println(Season.WINTER.getTask());
        } else if (currentSeason.equals(Season.SPRING.getCurrentSeason())) {
            System.out.println(Season.SPRING.getTask());
        } else if (currentSeason.equals(Season.SUMMER.getCurrentSeason())) {
            System.out.println(Season.SUMMER.getTask());
        } else if (currentSeason.equals(Season.AUTUMN.getCurrentSeason())) {
            System.out.println(Season.AUTUMN.getTask());
        } else {
            System.out.println("Invalid season name");
        }

    }
}
