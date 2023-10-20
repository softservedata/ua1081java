package com.softserve.practical01.p01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input three phrases:");
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String line3 = sc.nextLine();

        System.out.println(line3);
        System.out.println(line2);
        System.out.println(line1);

        sc.close();
    }

}