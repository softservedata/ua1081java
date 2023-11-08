package com.softserve.homework05.ex02;

import java.util.Scanner;

public class SumCalculator {
    static Scanner sc = new Scanner(System.in);
    boolean toContinue;

    public void calculateSum() {
        double num1;
        double num2;
        System.out.println("Please, input two numbers: ");
        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
        } else {
            System.out.println("Only numeric values can be accepted");
            sc.nextLine(); //removes Enter from buffer (happens when scanner jumps from numeric values to String)
            return;
        }
        if (sc.hasNextDouble()) {
            num2 = sc.nextDouble();
            sc.nextLine(); //removes Enter from buffer
            System.out.printf("Sum of two numbers is %s%n", (num1 + num2));
        } else {
            System.out.println("Only numeric values can be accepted");
            sc.nextLine();
            sc.nextLine();
            //it is necessary to remove two Enters to prevent end of cycle if String is input instead of 2nd number
        }
    }

    public void chooseNext() {
        System.out.println("Please, insert 'yes' to continue: ");
        String choice = sc.nextLine();
        toContinue = choice.equalsIgnoreCase("yes");
    }

    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();

        do {
            sumCalculator.calculateSum();
            sumCalculator.chooseNext();
        } while (sumCalculator.toContinue);
    }
}
