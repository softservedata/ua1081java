package com.softserve.edu.lesson_1.homeworks.hw_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Phone calls

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much a minute of call costs in the 1st country:");
        double firts_min = sc.nextDouble();//its not convenient name for variable -->firstMinute
        System.out.println("Сall duration in the 1st country:");
        double cost_first = sc.nextDouble();//the same as above -->costFirst
        System.out.println("Enter how much a minute of call costs in the 2nd country:");
        double second_min = sc.nextDouble();
        System.out.println("Сall duration in the 2nd country:");
        double cost_second = sc.nextDouble();
        System.out.println("Enter how much a minute of call costs in the 3rd country:");
        double third_min = sc.nextDouble();
        System.out.println("Сall duration in the 3rd country:");
        double cost_third = sc.nextDouble();

        double first_res = firts_min * cost_first;
        String f_res = String.format("%.2f", first_res);

        double second_res = second_min * cost_second;
        String s_res = String.format("%.2f", second_res);

        double third_res = third_min * cost_third;
        String t_res = String.format("%.2f", third_res);

        System.out.println("A call in the first country cost you $" + f_res);
        System.out.println("A call in the second country cost you $" + s_res);
        System.out.println("A call in the third country cost you $" + t_res);
    }
}
