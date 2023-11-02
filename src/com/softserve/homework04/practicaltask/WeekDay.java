package com.softserve.homework04.practicaltask;

import java.util.Scanner;

public enum WeekDay {
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    private final String en;
    private final String ua;

    WeekDay(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getEnUa() {
        return en + "\n" + ua;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the day number: ");

        int dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println(WeekDay.MONDAY.getEnUa());
                break;
            case 2:
                System.out.println(WeekDay.TUESDAY.getEnUa());
                break;
            case 3:
                System.out.println(WeekDay.WEDNESDAY.getEnUa());
                break;
            case 4:
                System.out.println(WeekDay.THURSDAY.getEnUa());
                break;
            case 5:
                System.out.println(WeekDay.FRIDAY.getEnUa());
                break;
            case 6:
                System.out.println(WeekDay.SATURDAY.getEnUa());
                break;
            case 7:
                System.out.println(WeekDay.SUNDAY.getEnUa());
                break;
            default:
                System.out.println("There is no such day. Try to enter another number.\nТакого дня не існує. Спробуйте ввести інше число.");
        }
    }
}
