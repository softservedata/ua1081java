package com.softserve.edu05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3};
//       // System.out.println(arr.length);
//        String[] dayWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        //System.out.println(Arrays.toString(dayWeek));
//
//        int[][] irregular={{1},{2,3,4},{5},{6,7}};
//        System.out.println(Arrays.deepToString(irregular));
        int number = 11;
        while (number <= 10) {
            System.out.println(number);
            number++;
        }
     //   System.out.println("Stop");

        var scanner = new Scanner(System.in);
//        int i;
//        do{
//            System.out.println("Enter number from 1 to 10");
//            i = scanner.nextInt();
//        } while (!(i >= 1 && i <= 10));
//        System.out.println("You entered " + i);
//
        String password;
        do{
            System.out.println("Create password with length to 10");
            password = scanner.nextLine();
        } while (password.length()< 10);
        System.out.println("Your password is " + password);

    }
}