package com.softserve.practical09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App21 {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        int n = 10;
        int k = 1;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            k = -k;
            integers.add(k * random.nextInt(n));
        }
        System.out.println("Original integers = " + integers);
        //
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) < 0) {
                integers.add(integers.indexOf(integers.get(i)), 999);
            }
        }
        System.out.println("Updated integers = " + integers);
    }
}
