package com.softserve.edu.lesson_12_functInterfaceAndDate.homework.hw_3;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Please enter year:");
            int year = Main.sc.nextInt();
            if (leapYear(year)) {
                System.out.println(year + " is leap year");
            } else {
                System.out.println(year + " is not leap year");
            }
        }catch (InputMismatchException e){
            System.err.println("Please enter only numbers");
        }
    }

    static boolean leapYear(int year) {
        return Year.of(year).isLeap();
    }
}
