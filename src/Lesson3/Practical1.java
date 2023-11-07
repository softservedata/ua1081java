package Lesson3;

import java.util.Scanner;

public class Practical1 {

    public static double getTotal(double num1, double num2) {

        return num1 + num2;

    }

    public static double getAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first num: ");
        num1 = scan.nextInt();

        System.out.println("Enter second num: ");
        num2 = scan.nextInt();

        System.out.println("The sum of: " + num1 + " and " + num2 + " is " + getTotal(num1, num2));
        System.out.println("The average of: " + num1 + " and " + num2 + " is " + getAverage(num1, num2));
    }


}
