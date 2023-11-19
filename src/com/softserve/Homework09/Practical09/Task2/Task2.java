package com.softserve.Homework09.Practical09.Task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        String console = "1,2,3,4,4,5,6,6,7,8";
        String[] integers = console.split(",");
        for (int i = 0; i < integers.length; i++) {
            set.add(Integer.parseInt(integers[i]));
        }
        for (Integer element:set) {
            System.out.println(element);
        }
    }
}
