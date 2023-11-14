package com.softserve.HomeWorke_JAVA_INTRODUCTION;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task2 {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 2. Write a program that takes three numbers from console as input to calculate and print output the average of the numbers //

        System.out.println("Input first number:");
        int userNumb1 = Integer.parseInt(br.readLine());
        System.out.println("Input second number:");
        int userNumb2 = Integer.parseInt(br.readLine());
        System.out.println("Input third number:");
        int userNumb3 = Integer.parseInt(br.readLine());

        int sum = userNumb1 + userNumb2 + userNumb3;
        float quantity = 3f;
        float average = sum/quantity;

        System.out.println("Average is: " + average);
    }

}