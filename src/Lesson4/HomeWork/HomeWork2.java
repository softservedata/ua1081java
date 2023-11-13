package Lesson4.HomeWork;

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class HomeWork2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        num2 = scan.nextInt();
        System.out.println("Enter third number: ");
        num3 = scan.nextInt();

        System.out.println("Max number is: " + max(num1, max(num2, num3)));
        System.out.println("Min number is: " + min(num1, min(num2, num3)));


    }
}
