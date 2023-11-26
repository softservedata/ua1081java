package com.softserve.Homework10.Task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1_union_insert {
    public static void main(String[] args) {
        Set<Integer> set1 = entry();
        Set<Integer> set2 = entry();
        System.out.println(" Set1:"+set1);
        System.out.println(" Set2:"+set2);
        Set<Integer> setUnion = union(set1,set2);
        System.out.println(" Union:"+setUnion);
        Set<Integer> setIntersect = intersect(set1,set2);
        System.out.println(" Intersect:"+setIntersect);

    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        result.retainAll(set2);
        result.retainAll(set1);
        return result;
    }

    public static Set<Integer> entry() {
        Set<Integer> set = new HashSet<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            set.add(rand.nextInt(21));
        }
        return set;
    }
}
