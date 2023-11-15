package com.softserve.edu.lesson_8_Arrays.practice.practice_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String numbers = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] split = numbers.split((",\\s*"));
        List<Integer> num = new ArrayList<>();

        for (String s : split) {
            num.add(Integer.parseInt(s));
        }

      /*  One way
       Set<Integer> set = new HashSet<>(num);
       System.out.println(set);
       */

        List<Integer> unique = new ArrayList<>();
        for (Integer i : num) {
            if (!unique.contains(i)) {
                unique.add(i);
            }

        }
        System.out.println(unique);
    }


}



