package com.softserve.edu04.practical;

//TODO Task1

import java.util.Scanner;

/**
 * Enter three numbers from the console.
 * Determine and output the result of how many of them are odd.
 * Output the result to the console.
 */
public class OddNumberCounter {
    //If you use scanner in several methods, it is better to declare it as a static variable.
    //It is not necessary to create a new object every time you call a method.
    //And you don't need to close it.
    static Scanner scanner = new Scanner(System.in);
    static int oddCount = 0;
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();

        if (number1 % 2 != 0) {
            oddCount++;
        }
        if (number2 % 2 != 0) {
            oddCount++;
        }
        if (number3 % 2 != 0) {
            oddCount++;
        }
        System.out.println("Number of odd numbers: " + oddCount);
    }
}
// Solution With loop for

//public class OddNumberCounter {
//    static Scanner scanner = new Scanner(System.in);
//    static int oddCount = 0;
//    public static void main(String[] args) {
//        System.out.println("Enter three numbers:");
//        for (int i = 0; i < 3; i++) {
//            int number = scanner.nextInt();
//            if (number % 2 != 0) {
//                oddCount++;
//            }
//        }
//        System.out.println("Number of odd numbers: " + oddCount);
//    }
//}
