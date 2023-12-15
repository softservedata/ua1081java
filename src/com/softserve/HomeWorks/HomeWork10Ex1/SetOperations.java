package com.softserve.HomeWorks.HomeWork10Ex1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static void main(String[] args) {
        // Create two sets with some elements
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6, 7));

        // Test union operation
        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionResult);

        // Test intersection operation
        Set<Integer> intersectResult = intersect(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersectResult);
    }
}

