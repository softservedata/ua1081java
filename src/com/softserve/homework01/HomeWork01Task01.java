package com.softserve.homework01;

import java.util.Scanner;

public class HomeWork01Task01 {
    public static void main(String[] args) {

//        Task 1 Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
//        from the console, and output obtained results.

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the radius: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

}
