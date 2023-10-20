package com.softserve.homework01.hw02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input your name:");
        String name = sc.nextLine();
        System.out.printf("Where do you live, %s?\n", name);
        String address = sc.nextLine();
        System.out.printf("Your name is %s and you live in %s.", name, address);

        sc.close();
    }
}