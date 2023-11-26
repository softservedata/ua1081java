package com.softserve.practicaltask08_list.task02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Numbers {
    public static void enterSetOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integers separated by commas (e.g: 1,2,3,4,4,5,6,6,7,8): ");

        String enteredNum = scanner.nextLine();

        String[] arrStr = enteredNum.split(",");

        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        Set<Integer> set = new HashSet<>();
        for (int value : arrInt) {
            set.add(value);
        }
        System.out.println(set);
    }

}
