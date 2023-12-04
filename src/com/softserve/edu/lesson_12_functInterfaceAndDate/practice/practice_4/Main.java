package com.softserve.edu.lesson_12_functInterfaceAndDate.practice.practice_4;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, -4, 756, 3, 2, 12};
        System.out.println("more than 5");
        count(arr, n -> n > 5);
        System.out.println("eql 12");
        count(arr, n -> n == 12);
        System.out.println("all");
        count(arr, n -> true);

    }

    public static void count(int[] arr, Predicate<Integer> p) {
        for (int i : arr) {
            if (p.test(i)) {
                System.out.println(i);
            }
        }

    }
}
