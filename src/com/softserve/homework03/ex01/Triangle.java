package com.softserve.homework03.ex01;
//For this task, it is advisable to also verify the existence of such a triangle.
public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double areaCalculator() {
        double s = 0.5 * (side1 + side2 + side3);//I know what is it s, but better to use full name of variable
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }
}
