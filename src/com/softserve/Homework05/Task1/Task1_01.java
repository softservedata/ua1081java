package com.softserve.Homework05.Task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task1_01 {
    public static void main(String[] args) {
        System.out.print(" Enter number of month: ");
        Scanner scanner = new Scanner(System.in);
        int monthDays = monthDays(scanner.nextInt());
        if(monthDays>0){
            System.out.println(" This month has "+monthDays+" days.");
        }else {
            throw  new RuntimeException(" Invalid month number!");
        }
        scanner.close();
    }
    public static int monthDays(int number){
        int[] mountDays={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < mountDays.length; i++) {
            if((i+1)==number){
                return mountDays[i];
            }
        }
        return -1;
    }
}
