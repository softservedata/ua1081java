package com.softserve.edu.lesson_2_OOP.homeworks.hw_2;

import java.util.Scanner;

public class Main {
    static int first_num;
    static int second_num;
    static int third_num;

    public static int smallestNum(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }

    public static void main(String[] args) {
        //Find smallest number amound thre integer

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer number:");
        Main.first_num = sc.nextInt();
        System.out.println("Enter second integer number:");
        Main.second_num = sc.nextInt();
        System.out.println("Enter third integer number:");
        Main.third_num = sc.nextInt();
        int smallest = Main.smallestNum(first_num, second_num, third_num);
        System.out.println("The smallest number is " + smallest);


    }
}
