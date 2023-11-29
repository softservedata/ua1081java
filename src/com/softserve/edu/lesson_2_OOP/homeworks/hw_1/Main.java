package com.softserve.edu.lesson_2_OOP.homeworks.hw_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static double first_side;
    static double second_side;
    static double third_side;

    public static double countArea(double s) {
        return Math.sqrt(s * (s - first_side) * (s - second_side) * (s - third_side));
    }


    public static void main(String[] args) {
        // Calculate area of a triangle
        Scanner sc = new Scanner(System.in);
        boolean a = false;
        while (!a) {
            try {
                System.out.println("Enter first side:");
                Main.first_side = sc.nextLong();
                System.out.println("Enter second side:");
                Main.second_side = sc.nextLong();
                System.out.println("Enter third side:");
                Main.third_side = sc.nextLong();
                if (Main.first_side + Main.second_side > Main.third_side && Main.first_side + Main.third_side > Main.second_side && Main.third_side + Main.second_side > Main.first_side) {
                    double perimeter = (first_side + second_side + third_side) / 2;
                    double area = Main.countArea(perimeter);
                    System.out.println("The area of the triangle is " + area);
                    a = true;
                }else {
                    System.out.println("The sides not form valid");
                }


            } catch (InputMismatchException e) {
                System.err.println("Please enter only numbers");
                sc = new Scanner(System.in);
            }
        }
    }
}
