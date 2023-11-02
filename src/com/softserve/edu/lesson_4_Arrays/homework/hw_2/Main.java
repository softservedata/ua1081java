package com.softserve.edu.lesson_4_Arrays.homework.hw_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first nummber");
            double first = sc.nextDouble();
            System.out.println("Please enter second number");
            double second = sc.nextDouble();
            System.out.println(first + second);
            System.out.println("Do you want perform the operation again ? yes / no");
            answer = sc.next();

        } while (answer.equals("yes"));
    }
}
