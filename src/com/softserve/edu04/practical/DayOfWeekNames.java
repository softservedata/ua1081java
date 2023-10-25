package com.softserve.edu04.practical;
//TODO Task2

import java.util.Scanner;

/**
 * Enter the number of the day of the week from the console.
 * Output the name of the day of the week in two languages.
 * Output the result to the console.
 */
public class DayOfWeekNames {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of the day of the week (1-7): ");
        int dayNumber = scanner.nextInt();
//You can use the switch statement here.
        switch (dayNumber) {
            case 1:
                System.out.println("Day of the week (English): " + DayOfWeek.MONDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.MONDAY.getUkrainianName());
                break;
            case 2:
                System.out.println("Day of the week (English): " + DayOfWeek.TUESDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.TUESDAY.getUkrainianName());
                break;
            case 3:
                System.out.println("Day of the week (English): " + DayOfWeek.WEDNESDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.WEDNESDAY.getUkrainianName());
                break;
            case 4:
                System.out.println("Day of the week (English): " + DayOfWeek.THURSDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.THURSDAY.getUkrainianName());
                break;
            case 5:
                System.out.println("Day of the week (English): " + DayOfWeek.FRIDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.FRIDAY.getUkrainianName());
                break;
            case 6:
                System.out.println("Day of the week (English): " + DayOfWeek.SATURDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.SATURDAY.getUkrainianName());
                break;
            case 7:
                System.out.println("Day of the week (English): " + DayOfWeek.SUNDAY.getEnglishName());
                System.out.println("Day of the week (Ukrainian): " + DayOfWeek.SUNDAY.getUkrainianName());
                break;
            default:
                System.out.println("Invalid day number. Please enter a number between 1 and 7.");
        }
//You can use the if statement here. It is more readable.

//        if (dayNumber >= 1 && dayNumber <= 7) {
//            DayOfWeek day = DayOfWeek.values()[dayNumber - 1];//because the array is zero-based
//
//            System.out.println("Day of the week (English): " + day.getEnglishName());
//            System.out.println("Day of the week (Ukrainian): " + day.getUkrainianName());
//        } else {
//            System.out.println("Invalid day number. Please enter a number between 1 and 7.");
//        }
    }
}

enum DayOfWeek {
    MONDAY("Понеділок", "Monday"),
    TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"),
    THURSDAY("Четвер", "Thursday"),
    FRIDAY("П'ятниця", "Friday"),
    SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");
    private final String ukrainianName;
    private final String englishName;

    DayOfWeek(String ukrainianName, String englishName) {
        this.ukrainianName = ukrainianName;
        this.englishName = englishName;
    }

    public String getUkrainianName() {
        return ukrainianName;
    }

    public String getEnglishName() {
        return englishName;
    }
}