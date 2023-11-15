package com.softserve.edu11set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrCompare {
    public static void main(String[] args) {
        Integer[] arr1 = {2, 4, 3, 1, 4, 2, 3};
        Integer[] arr2 = {3, 4, 4, 1, 2, 3, 4};
        //
        /* O(n^2)
        boolean result = true;
        for (int i = 0; (i < arr1.length) && result; i++) {
            result = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    result = true;
                    break;
                }
            }
        }
        for (int i = 0; (i < arr2.length) && result; i++) {
            result = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    result = true;
                    break;
                }
            }
        }
        //
        System.out.println("result = " + result);
        */
        //
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        System.out.println("result = " + set1.equals(set2)); // for(...)
    }
}
