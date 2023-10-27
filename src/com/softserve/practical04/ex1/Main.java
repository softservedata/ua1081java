package com.softserve.practical04.ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Please, input number 2: ");
        int num2 = sc.nextInt();
        System.out.print("Please, input number 3: ");
        int num3 = sc.nextInt();
        counter.oddCounter(num1);
        counter.oddCounter(num2);
        counter.oddCounter(num3);
        System.out.println(counter.getCounter());
    }
}
