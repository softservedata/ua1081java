package com.softserve.edu.lesson_4_Arrays.practice.practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the num : ");
        int num = sc.nextInt();

        if(num == 0 || num == 1) {
            System.out.println(num + " not prime");
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " prime ");
        }else {
            System.out.println(num + " not prime ");
        }

    }
}
