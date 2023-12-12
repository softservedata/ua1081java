package com.softserve.homework13.homework;

import java.time.Year;
import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the year: ");
        long year = scanner.nextLong();
        boolean result = Year.isLeap(year);
        System.out.println(result ? "The entered year is a leap year" : "The entered year is NOT a leap year");
    }
}
