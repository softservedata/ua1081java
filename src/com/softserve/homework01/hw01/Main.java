package com.softserve.homework01.hw01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, input radius of a bed: ");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Perimeter of a bed is: " + perimeter);
        System.out.println("Area of a bed is: " + area);

        sc.close();
    }
}