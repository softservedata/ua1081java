package com.softserve.homework08;

public abstract class Employee implements Comparable<Employee>,  Payment {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {
        return calculatePay() - emp.calculatePay();
    }

}
