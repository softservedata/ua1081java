package com.softserve.edu.lesson_2_OOP.homeworks.hw_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int first_num;
    static int second_num;
    static int third_num;
//use doc comments
    /**
     * Returns the smallest of three numbers.
     */
    public static int smallestNum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        //Find the smallest number amount three integer

        Scanner sc = new Scanner(System.in);
        boolean a = false;
        while (!a) {
            try {
                System.out.println("Enter first integer number:");
                Main.first_num = sc.nextInt();
                System.out.println("Enter second integer number:");
                Main.second_num = sc.nextInt();
                System.out.println("Enter third integer number:");
                Main.third_num = sc.nextInt();
                int smallest = Main.smallestNum(first_num, second_num, third_num);
                System.out.println("The smallest number is " + smallest);
                a = true;
            }catch (InputMismatchException e){
                System.err.println("Please enter only numbers");
                sc = new Scanner(System.in);
            }
        }

    }
}
//The use of static class variables (first_num, second_num, third_num) is not necessary in this context.
// You can directly pass the user input to the smallestNum method without storing them as class variables.
//
//Variable Naming Convention. It's good practice to use camelCase for variable names.
//Access Modifiers: It's good practice to limit the visibility of your methods and variables as much as possible.
// If smallestNum is only used within its class, you can make it private.
//
//Code Modularity:
// Your main method is doing a lot (taking input, processing, and output).
// You might want to separate these concerns for better modularity and readability.
//but for our task its can be