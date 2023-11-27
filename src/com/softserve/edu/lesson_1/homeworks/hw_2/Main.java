package com.softserve.edu.lesson_1.homeworks.hw_2;

import java.util.Scanner;

public class Main {//class name should be more informative
    public static void main(String[] args) {
        // Define name and address

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, friend, what's your name?: ");
        String name = sc.nextLine();
        System.out.println("Where do you live " + name);
        String address = sc.nextLine();
        System.out.println("My name is " + name + " and I live in " + address);
        sc.close();//don't forget to close scanner

    }
}
