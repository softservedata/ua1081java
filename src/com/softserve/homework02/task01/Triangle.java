package com.softserve.homework02.task01;

import java.util.Scanner;

public class Triangle {
    static Scanner scanner = new Scanner(System.in);

    public static void calculateAreaOfTriangle() {
        System.out.print("Input Side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = scanner.nextDouble();
        double p = side1 + side2 + side3;
        double area = Math.sqrt(p / 2 * (p / 2 - side1) * (p / 2 - side2) * (p / 2 - side3));
        System.out.printf("The area of the triangle is %(.2f%n", area);
    }
}
