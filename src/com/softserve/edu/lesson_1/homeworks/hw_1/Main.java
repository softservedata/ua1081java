package com.softserve.edu.lesson_1.homeworks.hw_1;

import java.util.Scanner;

public class Main {//class name should be more informative
    public static void main(String[] args) {
        // Perimeter and area

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius");
        double n = sc.nextDouble();
        System.out.println("Select whether you want to calculate perimeter(P) or Area(A) // P or A :");
        String choice = sc.next();
        System.out.println("Result:");
        if (choice.equals("P") || choice.equals("p")) {//better to use equalsIgnoreCase
            double p = 2 * 3.1415926 * n;//better to use Math.PI or constant
            System.out.println(p);//write more information, "Perimeter is " + p
        }
        if (choice.equals("A") || choice.equals("a")) {
            double a = 3.1415926 * (n * n);//better to use Math.pow(n, 2)
            System.out.println(a);//the same as above
        }
        sc.close();//don't forget to close scanner

    }
}
