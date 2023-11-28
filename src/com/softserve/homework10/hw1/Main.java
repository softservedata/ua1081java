package com.softserve.homework10.hw1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");
        set1.add("ddd");

        Set<String> set2 = new HashSet<>();
        set2.add("ccc");
        set2.add("ddd");
        set2.add("eee");
        set2.add("fff");

        Set unionResult = SetOperations.union(set1, set2);
        Set intersectResult = SetOperations.intersect(set1, set2);

        System.out.println("Union Operation Result: " + unionResult);
        System.out.println("Intersect Operation Result: " + intersectResult);
    }
}
