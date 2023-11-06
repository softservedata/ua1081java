package com.softserve.edu.lesson_5_OOP_Concepts.homework.hw_2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Igor",22,19200.21);
        Developer developer = new Developer("Roman",24,12200,"Middle Java Developer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
