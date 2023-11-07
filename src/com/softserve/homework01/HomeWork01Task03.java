package com.softserve.homework01;

import java.util.Scanner;

public class HomeWork01Task03 {
    public static void main(String[] args) {

//        Task 3 Three phone calls were made from different countries, each with a different cost per
//        minute (c1, c2, and c3) and duration (t1, t2, and t3). Input all the source data from the
//        console, calculate the cost of each call and the total cost, and output the results to the
//        console.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost ($) of a call per minute over a local network: ");
        double c1 = sc.nextDouble();
        System.out.print("Enter cost ($) of a call per minute to another operator: ");
        double c2 = sc.nextDouble();
        System.out.print("Enter cost ($) of a call per minute abroad: ");
        double c3 = sc.nextDouble();
        System.out.print("Enter duration (min) of local network call: ");
        double t1 = sc.nextDouble();
        System.out.print("Enter duration (min) of call to another operator: ");
        double t2 = sc.nextDouble();
        System.out.print("Enter duration (min) of call abroad: ");
        double t3 = sc.nextDouble();
        double cost1 = c1 * t1;
        double cost2 = c2 * t2;
        double cost3 = c3 * t3;
        System.out.println("Local network call cost: " + cost1 + " $");
        System.out.println("Another operator call cost: " + cost2 + " $");
        System.out.println("Abroad call cost: " + cost3 + " $");
        double totalCost = cost1 + cost2 + cost3;
        System.out.println("Total call cost: " + totalCost + " $");
        sc.close();//don't forget to close scanner
    }

}
