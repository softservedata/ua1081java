package com.softserve.homework07.ex01;

public abstract class Employee implements Payment, Comparable<Employee> {
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee o) {
        return (int) -(calculatePay() - o.calculatePay());
    }
}
