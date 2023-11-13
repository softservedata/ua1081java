package Lesson4.HomeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double num3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        num2 = scan.nextDouble();
        System.out.println("Enter third number: ");
        num3 = scan.nextDouble();

        if (compareNumbers(num1) && compareNumbers(num2) && compareNumbers(num3)) {
            System.out.println("Your numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }


    }

    public static boolean compareNumbers(double num) {
        return num <= 5 && num >= -5;
    }

}
