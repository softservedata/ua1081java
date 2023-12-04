package com.softserve.edu.lesson_13_streamAPI.practice.practice_2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        long count = primes.stream().count();
        System.out.println("Count: " + count);
        IntSummaryStatistics intSummaryStatistics = primes.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("Min: " + intSummaryStatistics.getMin());
        System.out.println("Max: " + intSummaryStatistics.getMax());
        System.out.println("Sum: " + intSummaryStatistics.getSum());


    }
}
