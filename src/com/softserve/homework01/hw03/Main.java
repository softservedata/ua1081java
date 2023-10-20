package com.softserve.homework01.hw03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minutes, seconds;
        double cost;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input duration (separately minutes and seconds) and cost per minute of the first call: ");
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        cost = sc.nextDouble();
        double durationFirstCall = minutes + (double)seconds / 60;
        double costFirstCall = durationFirstCall * cost;
        System.out.println("Please, input duration (separately minutes and seconds) and cost per minute of the second call: ");
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        cost = sc.nextDouble();
        double durationSecondCall = minutes + (double)seconds / 60;
        double costSecondCall = durationSecondCall * cost;
        System.out.println("Please, input duration (separately minutes and seconds) and cost per minute of the third call: ");
        minutes = sc.nextInt();
        seconds = sc.nextInt();
        cost = sc.nextDouble();
        double durationThirdCall = minutes + (double)seconds / 60;
        double costThirdCall = durationThirdCall * cost;
        double totalCost = costFirstCall + costSecondCall + costThirdCall;
        System.out.printf("Total cost of the first call is %.2f UAH. Total cost of the second call is %.2f UAH. Total cost of the third call is %.2f UAH. Total cost is %.2f UAH.",
                costFirstCall, costSecondCall, costThirdCall, totalCost);

        sc.close();
    }
}