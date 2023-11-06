package com.softserve.homework05_oop_part1.task02_oop;

public class Developer extends Employee {
    private final String position;


    public Developer(String name, int age, String average, double salary) {
        super(name, age, salary);
        this.position = average;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, Position: %s, Salary: \u20B4 %.2f.", name, age, position, salary);
    }
}
