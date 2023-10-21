package com.softserve.edu.lesson_1.practice.practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first =0;
        double second = 0;
        double third = 0;
        System.out.println("Input first num:");
        if(sc.hasNextDouble()){
            first = sc.nextDouble();
        }else {
            System.out.println("Incorrect num and first num equels = 0:");
            sc.next();
        }
        System.out.println("Input second num:");
        if(sc.hasNextDouble()){
            second = sc.nextDouble();
        }else {
            System.out.println("Incorrect num and second num equels = 0:");
            sc.next();
        }
        System.out.println("Input third num:");
        if(sc.hasNextDouble()){
            third = sc.nextDouble();
        }else {
            System.out.println("Incorrect num and first num equels = 0:");
            sc.next();
        }
        System.out.println("AVG num:");
        double avg = (first+second+third) / 3;
        System.out.println(avg);

    }
}
