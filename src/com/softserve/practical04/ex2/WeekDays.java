package com.softserve.practical04.ex2;

import java.util.Scanner;

public class WeekDays {
    private int weekDay = 0;

    public WeekDays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input number of a day in the week: ");
        weekDay = sc.nextInt();
    }

    public String dayNameGetter(int weekDayNumber) {
        String result = switch (weekDayNumber) {
            case 1 -> "Monday, Понеділок";
            case 2 -> "Tuesday, Вівторок";
            case 3 -> "Wednesday, Середа";
            case 4 -> "Thursday, Четвер";
            case 5 -> "Friday, П'ятниця";
            case 6 -> "Saturday, Субота";
            case 7 -> "Sunday, Неділя";
            default -> "Please, input a number from 1 to 7";
        };
        System.out.println(result);
        return result;
    }

    public int getWeekDay() {
        return weekDay;
    }
}
