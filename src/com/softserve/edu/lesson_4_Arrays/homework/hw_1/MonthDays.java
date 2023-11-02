package com.softserve.edu.lesson_4_Arrays.homework.hw_1;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {

        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int month = sc.nextInt();

        if (month >= 1 && month <= 12) {
            int day = days[month];
            System.out.println("Days in selected month " + day);
        } else {
            System.out.println("Please select correct month number");
        }
    }
}
