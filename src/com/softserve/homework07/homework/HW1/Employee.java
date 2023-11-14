package com.softserve.homework07.homework.HW1;

public abstract class Employee implements Comparable<Employee>{
    private String name;
    private final String employeeId;
    private double averageMonthlySalary;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public void setAverageMonthlySalary(double averageMonthlySalary) {
        this.averageMonthlySalary = averageMonthlySalary;
    }

    @Override
    public int compareTo(Employee employee) {
        if(averageMonthlySalary > employee.getAverageMonthlySalary())
            return -1;
        else if(averageMonthlySalary < employee.getAverageMonthlySalary())
            return 1;
        return 0;
    }
}
