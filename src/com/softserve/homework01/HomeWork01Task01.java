package com.softserve.homework01;

import java.util.Scanner;

public class HomeWork01Task01 {
    public static void main(String[] args) {

//        Task 1 Flower bed is shaped like a circle. Calculate its perimeter and area. Input the radius
//        from the console, and output obtained results.

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the radius: ");
        double radius = sc.nextDouble();
        double perimeter = (double) Math.round((2 * Math.PI * radius) * 100) /100; //better round to 2 digits after comma
        double area = (double) Math.round(Math.PI * Math.pow(radius, 2) * 100) /100;// its only one from other variants how to round
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        sc.close();
    }

}
