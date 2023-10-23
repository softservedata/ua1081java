package com.softserve.practicaltask01;

import java.util.Scanner;

public class PracticalTask01Task02 {
    public static void main(String[] args) {

//        PracticalTask 2
//        Write a program that takes three numbers from console as input to calculate and print
//        output the average of the numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Input second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Input third number: ");
        double num3 = sc.nextDouble();
        double avg = (num1 + num2 + num3) / 3;
        System.out.println("Average is " + avg);
    }

}
