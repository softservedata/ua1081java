package Homework_02_Ivan.Practical_02;

import java.util.Scanner;

public class Totalandavarage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // first number
        double firstNum = getNumber (sc, "Enter the first number ");
        // second number
        double secondNum = getNumber (sc, "Enter the second number ");

        // calculate the sum
        double sum = getTotal (firstNum, secondNum);
        System.out.printf("The sum of %.2f and %.2f is %.2f%n", firstNum, secondNum, sum);

        // calculate the average
        double average = getAverage (firstNum, secondNum);
        System.out.printf("The average of %.2f and %.2f is %.2f%n", firstNum, secondNum, average);

    }

    public static double getTotal(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }
    public static double getAverage(double firstNum, double secondNum) {
        return (firstNum + secondNum) / 2;
    }

    public static double getNumber(Scanner sc, String prompt) {
        System.out.print(prompt + ": ");

    while (!sc.hasNextDouble()) {
        System.out.print("Invalid input. Please enter a valid number: ");
        sc.next();
    }
        return sc.nextDouble();
    }
}