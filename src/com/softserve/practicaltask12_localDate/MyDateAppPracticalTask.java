package com.softserve.practicaltask12_localDate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MyDateAppPracticalTask {
    public static void main(String[] args) {

//        Task 01 Show which today is a day of a week
        LocalDate today = LocalDate.now();
        System.out.println("Today`s day of a week is " + today.getDayOfWeek());


//        Task 02 Show a date of first Monday for current month

//        LocalDate today2 = LocalDate.of(2023, Month.OCTOBER, 30);
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate firstMondayOfMonth = firstDayOfMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("The date of the first Monday for the current month is: " + firstMondayOfMonth);


//        Task 03 Write a method for sorting list of Strings using Java 8
        List<String> stringList = new ArrayList<>();
        stringList.add("Pink");
        stringList.add("Blue");
        stringList.add("Red");
        stringList.add("Green");
        stringList.add("Yellow");
        stringList.add("Black");

        sortedString(stringList);


//        Task 04 Create array Integers which has 10 elements, create method count() that takes an array
//        of integers as the first parameter and functional interface as the second parameter,
//        that functional interface works with integers and defines a condition. Method count()
//        return count of elements in array that satisfy the condition defined by the second
//        argument.

        int[] integers = {2, 3, 5, 6, 4, 1, 2, 3, 7, 8};
        int evenCount = count(integers, x -> x % 2 == 0);
        System.out.println("Even numbers in array is : " + evenCount);

        int greaterThanFive = count(integers, x -> x > 5);
        System.out.println("Count of numbers greater than 5 in array: " + greaterThanFive);

    }

    public static List<String> sortedString(List<String> list) {
//        Collections.sort(list);
//        for (String s : list) {
//            System.out.println(s);
//        }
//        return list;

        list.sort((s1, anotherString) -> s1.compareTo(anotherString));
        for (String s : list) {
            System.out.println(s);
        }
        return list;
    }

    public static int count(int[] arrays, Predicate<Integer> predicate) {
        int count = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (predicate.test(i)) {
                count++;
            }
        }

        return count;
    }

}
