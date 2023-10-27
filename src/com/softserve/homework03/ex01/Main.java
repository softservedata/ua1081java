package com.softserve.homework03.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Input Side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Input Side 3: ");
        double side3 = sc.nextDouble();
        sc.close();

        Triangle triangle1 = new Triangle(side1, side2, side3);
        System.out.printf("The area of the triangle is %.2f", triangle1.areaCalculator());
    }
}
