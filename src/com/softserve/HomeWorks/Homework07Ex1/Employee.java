package com.softserve.HomeWorks.Homework07Ex1;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    private static int nextId = 1;

    private int id;
    private String name;
    private double averageMonthlySalary;

    public Employee(String name, double averageMonthlySalary) {
        this.id = nextId++;
        this.name = name;
        this.averageMonthlySalary = averageMonthlySalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAverageMonthlySalary() {
        return averageMonthlySalary;
    }

    public static void main(String[] args) {
        // Create an array of employees with different forms of payment
        Employee[] employees = {
                new HourlyWorker("John", 20.0, 160),          // Hourly worker with hourly rate $20 and 160 hours worked
                new SalariedWorker("Alice", 4000.0),         // Salaried worker with fixed monthly payment $4000
                new HourlyWorker("Bob", 18.0, 180),           // Hourly worker with hourly rate $18 and 180 hours worked
                new SalariedWorker("Eve", 3500.0)            // Salaried worker with fixed monthly payment $3500
        };

        // Arrange the entire sequence of workers in descending order of average monthly wage
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getAverageMonthlySalary).reversed());

        // Output employee ID, name, and average monthly wage
        System.out.println("Employee Information (Sorted by Average Monthly Wage in Descending Order):");
        for (Employee employee : employees) {
            System.out.printf("ID: %d, Name: %s, Average Monthly Wage: $%.2f%n",
                    employee.getId(), employee.getName(), employee.getAverageMonthlySalary());
        }
    }
}

class HourlyWorker extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyWorker(String name, double hourlyRate, double hoursWorked) {
        super(name, calculateAverageMonthlySalary(hourlyRate, hoursWorked));
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    private static double calculateAverageMonthlySalary(double hourlyRate, double hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}

class SalariedWorker extends Employee {
    private double fixedMonthlyPayment;

    public SalariedWorker(String name, double fixedMonthlyPayment) {
        super(name, fixedMonthlyPayment);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }
}

