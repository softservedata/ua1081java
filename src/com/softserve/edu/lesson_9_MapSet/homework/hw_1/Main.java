package com.softserve.edu.lesson_9_MapSet.homework.hw_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*
        Set<Integer> set1 = new HashSet<>();
        set1.add(312);
        set1.add(34);
        set1.add(4);
        set1.add(22);
        set1.add(54);
        set1.add(21);

        Set<Integer>set2 = new HashSet<>();
        set2.add(3);
        set2.add(54);
        set2.add(55);
        set2.add(21);
        set2.add(4);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println(union);

        Set<Integer>intersect = new HashSet<>(set1);
        intersect.retainAll(set2);

        System.out.println(intersect);
        */

        Set<String> set1 = new HashSet<>();
        set1.add("aa");
        set1.add("ab");
        set1.add("bc");
        set1.add("bb");
        set1.add("ba");
        set1.add("av");

        Set<String> set2 = new HashSet<>();
        set2.add("av");
        set2.add("kk");
        set2.add("aa");
        set2.add("fr");
        set2.add("cv");

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        Set<String> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);

    }

}
