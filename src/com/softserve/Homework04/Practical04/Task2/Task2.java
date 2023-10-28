package com.softserve.Homework04.Practical04.Task2;

import java.nio.file.WatchEvent;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(" ******  Practical Task2 *****");
        int number;
        String urkName = null;
        String engName = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number of day week: ");
        number = scanner.nextInt();
        switch (number) {
            case 1:
                urkName = WeekDays.MONDAY.getUkrName();
                engName = WeekDays.MONDAY.engName;
                break;
            case 2:
                urkName = WeekDays.TUESDAY.getUkrName();
                engName = WeekDays.TUESDAY.engName;
                break;
            case 3:
                urkName = WeekDays.WEDNESDAY.getUkrName();
                engName = WeekDays.WEDNESDAY.engName;
                break;
            case 4:
                urkName = WeekDays.THURSDAY.getUkrName();
                engName = WeekDays.THURSDAY.engName;
                break;
            case 5:
                urkName = WeekDays.FRIDAY.getUkrName();
                engName = WeekDays.FRIDAY.engName;
                break;
            case 6:
                urkName = WeekDays.SATURDAY.getUkrName();
                engName = WeekDays.SATURDAY.engName;
                break;
            case 7:
                urkName = WeekDays.SUNDAY.getUkrName();
                engName = WeekDays.SUNDAY.engName;
                break;
        }
        System.out.println(String.format(" Day of week (ukr: %s  ;  eng: %s  )", urkName, engName));

    }

    enum WeekDays {
        MONDAY("Понеділок", "Monday"), TUESDAY("Вівторок", "Tuesday"),
        WEDNESDAY("Середа", "Wednesday"), THURSDAY("Четвер", "Thursday"),
        FRIDAY("П'ятниця", "Friday"), SATURDAY("Субота", "Saturday"),
        SUNDAY("Неділя", "Sunday");
        private final String ukrName;
        private final String engName;

        WeekDays(String ukr, String eng) {
            ukrName = ukr;
            engName = eng;
        }

        public String getUkrName() {
            return ukrName;
        }

        public String getEngName() {
            return engName;
        }
    }
}
