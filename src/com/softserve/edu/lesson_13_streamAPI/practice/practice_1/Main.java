package com.softserve.edu.lesson_13_streamAPI.practice.practice_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "", "blablabla");

        long count = list.stream().filter(String::isEmpty).count();
        System.out.println("Empty strings in list is: " + count);

        List<String> deletedEmpty = list.stream().filter(i -> !i.isEmpty()).toList();
        System.out.println("Deleted all empty: " + deletedEmpty);

        String toUpperCase = list.stream().filter(i -> !i.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println("All to Upper Case: " + toUpperCase);

    }
}