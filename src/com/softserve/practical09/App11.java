package com.softserve.practical09;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App11 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        int n = 10;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lst.add(random.nextInt(n));
        }
        System.out.println("Original lst = " + lst);
        //
        List<Integer> index = new ArrayList<>(n + 1);
        for (int i = 0; i < n + 1; i++) {
            index.add(0);
        }
        for (int i = 0; i < lst.size(); i++) {
            index.set(lst.get(i), index.get(lst.get(i)) + 1);
        }
        //System.out.println("Indexes lst = " + index);
        for (int i = 0; i < index.size(); i++) {
            System.out.print("(i = " + i + "  index = " + index.get(i)+"), ");
        }
    }
}
