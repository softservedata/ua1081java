// Java Program with a method to find Area of Triangle when three sides are given

package Homework_02_Ivan.Homework;

import java.util.Scanner;

public class Triangle_Area {

    private static double area;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input side 1 of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.println("Input side 2 of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.println("Input side 3 of the triangle: ");
        double side3 = sc.nextDouble();
        area = getTriangleArea(side1, side2, side3);
        System.out.format("The Area of the triangle = %.2f",area);
    }

    static double getTriangleArea (double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area; // area
    }

}