package com.softserve.homework10.hw1;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static Set union(Set set1, Set set2) {
        Set result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set intersect(Set set1, Set set2) {
        Set result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }
}
