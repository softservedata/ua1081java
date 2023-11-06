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
        double p = side1 + side2 + side3;//better use name "perimeter" instead of "p"
        double semiPerimeter = p / 2;// may be make sense to create variable "semiPerimeter"?
        double area = Math.sqrt(p / 2 * (p / 2 - side1) * (p / 2 - side2) * (p / 2 - side3));
        System.out.printf("The area of the triangle is %(.2f%n", area);
    }
}
//For this task you should create a separate class Triangle with method calculateAreaOfTriangle()
// and call it from main() method of Main class.

//For this task,
// the condition did not require checking the possibility of a triangle's existence with the side lengths entered by the user.
// However, it is good to think through such details. After you have learned about conditional statements,
// it would be wise to set a constraint on the semi perimeter, at least that it is positive.