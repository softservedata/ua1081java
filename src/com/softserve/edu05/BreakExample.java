package com.softserve.edu05;

import java.util.Scanner;

public class BreakExample {
    static final  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int sum = 0;
        int n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = sc.nextInt();
            if (n < 0) {
                continue;
            }
            sum += n;
        }
        System.out.println("End for loop");
        System.out.println("Sum is " + sum);
    }
}
