package com.softserve.edu.lesson_1.homeworks.hw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Perimetr and area

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius");
        double n = sc.nextDouble();
        System.out.println("Select whether you want to calculate perimeter(P) or Area(A) // P or A :");
        String choice = sc.next();
        System.out.println("Result:");
        if (choice.equals("P") || choice.equals("p") ) {
            double p = 2 * 3.1415926 * n;
            System.out.println(p);
        }
        if (choice.equals("A") || choice.equals("a")) {
            double a = 3.1415926 * (n * n);
            System.out.println(a);
        }


    }
}
