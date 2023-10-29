package com.softserve.Homework03.Task01;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public void setSideA(double sideA) {
        if (sideA >= 0) {
            this.sideA = sideA;
        } else {
            System.out.println("Incorrect value");
        }
    }

    public void setSideB(double sideB) {
        if (sideB >= 0) {
            this.sideB = sideB;
        } else {
            System.out.println("Incorrect value");
        }
    }

    public void setSideC(double sideC) {
        if (sideC >= 0) {
            this.sideC = sideC;
        } else {
            System.out.println("Incorrect value");
        }
    }

    public double calculateArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        double S = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return S;
    }
}
