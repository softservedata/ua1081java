package com.softserve.practical09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App01 {

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        int n = 10;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lst.add(random.nextInt(n));
        }
        System.out.println("Original lst = " + lst);
        //
        for (int i = 0; i < lst.size(); i++) {
            int element = lst.get(i);
            for (int j = i + 1; j < lst.size(); j++) {
                if (element == lst.get(j)) {
                    System.out.println("duplicate foud, lst.get(j) = " + lst.get(j));
                    lst.remove(j);
                }
            }
        }
        //
        System.out.println("Updated lst = " + lst);
    }

}
