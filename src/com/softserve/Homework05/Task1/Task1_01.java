package com.softserve.Homework05.Task1;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
//done't forget format your code
public class Task1_01 {
    static Scanner scanner = new Scanner(System.in);//better to do scanner as static
    public static void main(String[] args) {
        System.out.print(" Enter number of month: ");

        int monthDays = monthDays(scanner.nextInt());
        if(monthDays>0){
            System.out.println(" This month has "+monthDays+" days.");
        }else {
            System.out.println(" Invalid month number!");
        }
        scanner.close();
    }
    public static int monthDays(int number){
        int[] mountDays={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < mountDays.length; i++) {
            if((i+1)==number){
                return mountDays[i];
            }
            //may be better to do like this
            //if (number >= 1 && number <= 12) {
            //            return monthDays[number - 1];
            //
            //        }
        }
        return -1;
    }
}
