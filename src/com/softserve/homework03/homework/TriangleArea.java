package com.softserve.homework03.homework;

import java.util.Scanner;

public class TriangleArea {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(double thirdSide) {
        this.thirdSide = thirdSide;
    }

    public double getArea() {
        double semiperimeter = (getFirstSide() + getSecondSide() + getThirdSide()) / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - getFirstSide()) * (semiperimeter - getSecondSide()) * (semiperimeter - getThirdSide()));
    }

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
