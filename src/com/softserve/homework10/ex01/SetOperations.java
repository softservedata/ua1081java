package com.softserve.homework10.ex01;

import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class SetOperations {
//Object is used in order to enable inclusion of different data types. For strictly same type in both sets it was possible to use <T> instead
    public static Set<Object> union(Set<Object> set1, Set<Object> set2) {
        Set<Object> copiedSet = new HashSet<>(set1);
        copiedSet.addAll(set2);
        return copiedSet;
    }

    public static Set<Object> intersect(Set<Object> set1, Set<Object> set2) {
        Set<Object> copiedSet = new HashSet<>(set1);
        copiedSet.retainAll(set2);
        return copiedSet;
    }

    public static void main(String[] args) {
        Set<Object> set1 = new HashSet<>(List.of(1, 2, 3, 6, 7));
        Set<Object> set2 = new HashSet<>(List.of(2, 3, 4, 5));
        System.out.printf("Union of %s and %s: %s%n", set1, set2, union(set1, set2));
        System.out.printf("Intersection of %s and %s: %s%n", set1, set2, intersect(set1, set2));

        Set<Object> set3 = new HashSet<>(List.of("1", "2", "3", "6", "7"));
        Set<Object> set4 = new HashSet<>(List.of("2", 3, "4", "5", 6));
        System.out.printf("Union of %s and %s: %s%n", set3, set4, union(set3, set4));
        System.out.printf("Intersection of %s and %s: %s%n", set3, set4, intersect(set3, set4));

        Set<Object> set5 = new HashSet<>();
        set5.add(1);
        Set<Object> set6 = new HashSet<>();
        set6.add(null);
        System.out.printf("Union of %s and %s: %s%n", set5, set6, union(set5, set6));
        System.out.printf("Intersection of %s and %s: %s%n", set5, set6, intersect(set5, set6));
    }
}
