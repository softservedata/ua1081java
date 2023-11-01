package com.softserve.homework04.practicaltask;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the day number: ");

        int dayNumber = scanner.nextInt();
        String result;

        switch (Integer.valueOf(dayNumber)) {
            case 1:
                result = "Monday\nПонеділок";
                break;
            case 2:
                result = "Tuesday\nВівторок";
                break;
            case 3:
                result = "Wednesday\nСереда";
                break;
            case 4:
                result = "Thursday\nЧетвер";
                break;
            case 5:
                result = "Friday\nП'ятниця";
                break;
            case 6:
                result = "Saturday\nСубота";
                break;
            case 7:
                result = "Sunday\nНеділя";
                break;
            default:
                result = "There is no such day. Try to enter another number.\nТакого дня не існує. Спробуйте ввести інше число.";
        }
        System.out.println("\nToday is:\n" + result);
    }
}
