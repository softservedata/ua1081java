package com.softserve.edu.lesson_3_Enums.practice.practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of the day of the week: ");
        int day = sc.nextInt();
        if ((day > 0) && (day <= 7)) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    System.out.println("Понеділок");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    System.out.println("Вівторок");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    System.out.println("Середа");
                    break;
                case 4:
                    System.out.println("Thursday");
                    System.out.println("Четвер");
                    break;
                case 5:
                    System.out.println("Friday");
                    System.out.println("Пятниця");
                    break;
                case 6:
                    System.out.println("Saturday");
                    System.out.println("Субота");
                    break;
                case 7:
                    System.out.println("Sunday");
                    System.out.println("Неділя");
                    break;
                default:
                    break;
            }

        }else {
            throw new IllegalArgumentException("Please enter correct number");
        }


    }
}

