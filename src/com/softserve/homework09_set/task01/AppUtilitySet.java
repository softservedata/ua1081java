package com.softserve.homework09_set.task01;

import java.util.HashSet;
import java.util.Set;

public class AppUtilitySet {
    public static <T> Set<T> methodUnionTwoSet(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersectedOfTwoSets(Set<T> set1, Set<T> set2) {
        set1.retainAll(set2);
        return set1;
    }
}
