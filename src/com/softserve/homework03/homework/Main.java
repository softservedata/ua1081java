package com.softserve.homework03.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangleArea triangleArea = new TriangleArea();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first side of the triangle: ");
        triangleArea.setFirstSide(scanner.nextDouble());
        System.out.print("Enter the length of the second side of the triangle: ");
        triangleArea.setSecondSide(scanner.nextDouble());
        System.out.print("Enter the length of the third side of the triangle: ");
        triangleArea.setThirdSide(scanner.nextDouble());

        System.out.println("Input Side 1: " + triangleArea.getFirstSide() +
                "\nInput Side 2: " + triangleArea.getSecondSide() +
                "\nInput Side 3: " + triangleArea.getThirdSide() +
                "\nThe area of the triangle is : " + String.format("%.2f", triangleArea.getArea()));
    }
}
