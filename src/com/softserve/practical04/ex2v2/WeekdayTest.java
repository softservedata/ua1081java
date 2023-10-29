package com.softserve.practical04.ex2v2;

import java.util.Scanner;

public class WeekdayTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please, input a number of the weekday:");
        int input = sc.nextInt();
        Weekday result = switch (input) {
            case 1 -> Weekday.MONDAY;
            case 2 -> Weekday.TUESDAY;
            case 3 -> Weekday.WEDNESDAY;
            case 4 -> Weekday.THURSDAY;
            case 5 -> Weekday.FRIDAY;
            case 6 -> Weekday.SATURDAY;
            case 7 -> Weekday.SUNDAY;
            default -> Weekday.INVALID_DAY;
        };
        System.out.println(result.getEn());
        System.out.println(result.getUa());
    }
}
