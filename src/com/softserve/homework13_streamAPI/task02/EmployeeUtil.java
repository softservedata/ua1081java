package com.softserve.homework13_streamAPI.task02;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtil {
    public static void main(String[] args) {

//        Task 02 Realize method
//        static Optional<String> mostPopularName(Stream< Employee> employees) {return null; }
//        For given a stream with objects of Employee class, return the optional, containing the most
//        popular name. If this stream is empty, Optional.empty should be returned.
//        For example:
//        empl1.name = “Bob”, empl2.name = “Din”,
//        empl3.name = “Sam”, empl4.name = “Sam”
//        “Sam” should be returned.

        Employee employee1 = new Employee("Bob");
        Employee employee2 = new Employee("Din");
        Employee employee3 = new Employee("Sam");
        Employee employee4 = new Employee("Sam");

        Stream<Employee> employeeStream = Stream.of(employee1, employee2, employee3, employee4);
        Optional<String> mostPopularName = mostPopularName(employeeStream);
        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));

    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees
                .collect(Collectors.groupingBy(employee -> employee.getName(), Collectors.counting()));
        if (nameCountMap.isEmpty()) {
            return Optional.empty();
        }
        Optional<Map.Entry<String, Long>> maxEntry = nameCountMap.entrySet().stream()
                .max(Comparator.comparing(stringLongEntry -> stringLongEntry.getValue()));
        return maxEntry.map(stringLongEntry -> stringLongEntry.getKey());
    }
}
