package com.softserve.homework05_oop_part1.task02_oop;

public class Employee {
    protected String name;
    protected int age;
    protected double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }


    public String report() {
        return String.format("Name: %s, Age: %d, " + "Salary: \u20B4 %.2f.", name, age, salary);
    }

}
