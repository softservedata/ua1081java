package com.softserve.practicaltask13_streamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class PacticalTask13Demo {
    public static void main(String[] args) {

//        Task 01 Suppose you have next list
//        List<String> list = Arrays.asList("bla", "", "simp",
//                "", "second", "third", "third", "sec", "blablabla");
//          • Print how many empty strings are in this list
//          • Remove all empty Strings from list and print the result
//          • Convert String to uppercase and Join them with coma. Print the result

        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");
        long numberOfEmptyString = list.stream()
                .filter(string -> (string.isEmpty()))
                .count();
        System.out.println(numberOfEmptyString);

        System.out.println(list.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList()));

        System.out.println(list.stream()
                .map(i -> i.toUpperCase() + ",")
                .collect(Collectors.toList()));

//        Task 02 For given collection
//        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        calculate count, min, max, sum, for numbers and print all results

        System.out.println("\nTask 02");
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
//        System.out.println("Count: " + primes.stream()
//                .count());

        IntSummaryStatistics stats = primes.stream()
                .mapToInt(integer -> integer.intValue())
                .summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Count of all numbers : " + stats.getCount());
    }
}
