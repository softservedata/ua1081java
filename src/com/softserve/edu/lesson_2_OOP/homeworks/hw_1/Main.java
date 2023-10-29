package com.softserve.edu.lesson_2_OOP.homeworks.hw_1;

import java.util.Scanner;

public class Main {
    static int first_side;
    static int second_side;
    static int third_side;

    public static double countArea(double s) {
        return Math.sqrt(s * (s - first_side) * (s - second_side) * (s - third_side));
    }


    public static void main(String[] args) {
        // Calculate area of a triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        Main.first_side = sc.nextInt();
        System.out.println("Enter second side:");
        Main.second_side = sc.nextInt();
        System.out.println("Enter third side:");
        Main.third_side = sc.nextInt();

        double perimetr = first_side + second_side + third_side;
        double s = perimetr / 2;
        double area = Main.countArea(s);
        String area_res = String.format("%.2f", area);

        System.out.println("The area of the triangle is " + area_res);

    }
}
