package com.softserve.homework07.homework.HW1;

import java.util.Comparator;

public abstract class Employee implements Comparable<Employee>{

    public static class ByNameAsc implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getName().compareTo(emp2.getName());
        }
    }

    public static class ByNameDesc implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return -emp1.getName().compareTo(emp2.getName());
        }
    }

    public static class ByAverageSalaryAsc implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            if(emp1.getAverageMonthlySalary() < emp2.getAverageMonthlySalary())
                return -1;
            else if(emp1.getAverageMonthlySalary() > emp2.getAverageMonthlySalary())
                return 1;
            return 0;
        }
    }

    public static class ByAverageSalaryDesc implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            if(emp1.getAverageMonthlySalary() > emp2.getAverageMonthlySalary())
                return -1;
            else if(emp1.getAverageMonthlySalary() < emp2.getAverageMonthlySalary())
                return 1;
            return 0;
        }
    }

    private String name;
    private String employeeId;
    private double averageMonthlySalary;

    public Employee(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public Employee() {
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

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
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
