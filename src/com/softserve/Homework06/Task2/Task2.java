package com.softserve.Homework06.Task2;

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 26, 5200);
        Developer developer = new Developer("Alice Smith", 35, 12500, "Java");
        System.out.println(" ○ Employee");
        System.out.println(employee.report());
        System.out.println(" ○ Developer");
        System.out.println(developer.report());
    }
}
