package com.softserve.homework14.ex02;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    static Optional<String> mostPopularName(Stream<Employee> employees) {

        List<Employee> list = employees.toList();
        if (list.isEmpty()) return Optional.empty();

        Optional<Map.Entry<String, Long>> max = list.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return max.map(Map.Entry::getKey);

    }

    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(new Employee("Ivan", "Auditor"),
                new Employee("Ivan", "IT"), new Employee("Alex", "Economist"),
                new Employee("Alex", "Tourist"), new Employee("Ivan", "Journalist"));
        Stream<Employee> emptyStream = Stream.empty();
        Optional<String> mostPopularByName = mostPopularName(employeeStream);
        System.out.println(mostPopularByName.orElse("There are no elements"));

        Optional<String> mostPopularByName2 = mostPopularName(emptyStream);
        System.out.println(mostPopularByName2.orElse("There are no elements"));

    }
}
