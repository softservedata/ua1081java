package com.softserve.edu10list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class AppBigSort {

    public static void main(String[] args) {
        int n = 100000;
        Sort sort = new Sort();
        int[] arr = new int[n];
        Random random = new Random();
        //
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        //
        long timeStart = System.currentTimeMillis();
        //sort.bubbleInt(arr); // O(n^2)
        sort.mergeInt(arr); // O(n*log(n))
        //Arrays.sort(arr);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Duration = " + 1.0 * (timeEnd - timeStart) / 1000.0);
        //
        //System.out.println("Result = " + Arrays.toString(arr));
    }
}
