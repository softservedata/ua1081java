package com.softserve.edu.HW10.Task1;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);

        setB.add(2);
        setB.add(3);
        setB.add(4);
        
        Set<Integer> unionResult = union(setA, setB);
        System.out.println("Union: " + unionResult);

        Set<Integer> intersectionResult = intersect(setA, setB);
        System.out.println("Intersection: " + intersectionResult);
    }
    
}
