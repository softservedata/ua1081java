package com.softserve.edu.lesson_12_functInterfaceAndDate.practice.practice_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Igor","Roll","Kaka","MacBook","List","Adrian");
        List<String> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
