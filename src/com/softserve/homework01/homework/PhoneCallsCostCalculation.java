/*
  Three phone calls were made from different countries,
  each with a different cost per minute (c1, c2, and c3) and duration (t1, t2, and t3).
  Input all the source data from the console, calculate the cost of each call and the total cost,
  and output the results to the console.
 */

package com.softserve.homework01.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Class allows to calculate the cost of individual calls based on the call tariff and call duration values,
 * as well as the total cost of the calls made.
 * */
public class PhoneCallsCostCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program allows you to calculate the cost of individual calls, as well as the total cost of calls made. " +
                "\nLet's get started! " +
                "\n\nHow many phone calls were made during the time period you are interested in?");

        int callsNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Please enter the sign of the currency in which the cost of the calls will be stated.");

        String currency = sc.nextLine();

        double[] c = new double[callsNumber + 1];
        int[] t = new int[callsNumber + 1];
        double[] individualCallCost = new double[callsNumber + 1];

        for(int i = 1; i<callsNumber + 1;i++)
        {
            System.out.println("Please enter the COST PER MINUTE for call #" + i);
            c[i] = sc.nextDouble();
            System.out.println("Please enter the duration of call #" + i + "in minutes");
            t[i] = sc.nextInt();
            individualCallCost[i] = c[i] * t[i];
        }

        double total = Arrays.stream(individualCallCost).sum();

        System.out.println("\n\nData on the cost of calls made are as follows: \n");

        for(int i = 1; i < callsNumber + 1; i++)
        {
            System.out.println("Cost of call #" + i + ": " + currency + String.format("%.2f", individualCallCost[i]) + ".");
        }

        System.out.println("\nThe total value of the calls made is " + currency + String.format("%.2f", total) + ".");
    }
}
