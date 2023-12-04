package com.softserve.edu.lesson_13_streamAPI.homework.hw_2;


import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Employee> employee = Stream.of(
                new Employee("Sam"),
                new Employee("Bob"),
                new Employee("Ira"),
                new Employee("Roland"),
                new Employee("Sam")

        );

        mostPopularName(employee).ifPresentOrElse(c -> System.out.println("The most popular name " + c),
                () -> System.out.println("No popular name or empty"));

    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> collect = employees.map(Employee::getName).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Map.Entry<String, Long>> max = collect.entrySet().stream().filter(e -> e.getValue() > 1).max(Map.Entry.comparingByValue());

        return max.map(Map.Entry::getKey);
    }
}
