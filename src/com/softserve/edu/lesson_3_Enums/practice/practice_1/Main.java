package com.softserve.edu.lesson_3_Enums.practice.practice_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //show odd numbers

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("This program shows all odd numbers");
        System.out.println("Please enter first num:");
        int first = sc.nextInt();
        System.out.println("Please enter second num:");
        int second = sc.nextInt();
        System.out.println("Please enter third num:");
        int third = sc.nextInt();
        if ((first % 2) != 0) {
            count++;
            System.out.println(first + " - it is odd");
        }
        if ((second % 2) != 0) {
            count++;
            System.out.println(second + " - it is odd");
        }
        if ((third % 2) != 0) {
            count++;
            System.out.println(third + " - it is odd");
        }

        System.out.println("We have " + count + " odd numbers");


    }
}
