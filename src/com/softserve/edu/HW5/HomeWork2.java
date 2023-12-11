package com.softserve.edu.HW5;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repeat = "No";

        do {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is: " + sum);

            System.out.print("Do you want to perform the operation again? (yes/no): ");
            repeat = sc.next();

        } while (repeat.equals("yes"));

        sc.close();
    }
    
}
