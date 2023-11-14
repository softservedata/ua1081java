package com.softserve.Homework_JAVA_INTRODUCTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("How many minutes did the first call last?");
        double t1 = Double.parseDouble(br.readLine());
        System.out.println("What is the cost per minute of a call?");
        double c1 = Double.parseDouble(br.readLine());

        System.out.println("How many minutes did the second call last?");
        double t2 = Double.parseDouble(br.readLine());
        System.out.println("What is the cost per minute of a call?");
        double c2 = Double.parseDouble(br.readLine());

        System.out.println("How many minutes did the third call last?");
        double t3 = Double.parseDouble(br.readLine());
        System.out.println("What is the cost per minute of a call?");
        double c3 = Double.parseDouble(br.readLine());

        double price1 = t1 * c1;
        double price2 = t2 * c2;
        double price3 = t3 * c3;
        double total = price1 + price2 + price3;

        System.out.println("The price of the first call = " + price1);
        System.out.println("The price of the second call = " + price2);
        System.out.println("The price of the third call = " + price3);
        System.out.println("Total call price = " + total);
    }

}