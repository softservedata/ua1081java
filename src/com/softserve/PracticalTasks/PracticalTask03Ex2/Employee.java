package com.softserve.PracticalTasks.PracticalTask03Ex2;

import java.util.Scanner;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    private static double totalSum = 0;

    // Default constructor
    public Employee() {
    }

    // Constructor with parameters
    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    // Properties to access private fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
        totalSum -= getSalary(); // Subtract previous salary contribution
        totalSum += getSalary(); // Add updated salary contribution
    }

    // Method to calculate the salary of an employee
    public double getSalary() {
        return rate * hours;
    }

    // Method to calculate bonuses (10% of salary)
    public double getBonuses() {
        return 0.1 * getSalary();
    }

    // Method to output information about the employee
    @Override
    public String toString() {
        return "Employee{name='" + name + "', rate=" + rate + ", hours=" + hours + ", salary=" + getSalary() + '}';
    }

    // Static method to display the total salary of all employees
    public static void displayTotalSalary() {
        System.out.println("Total salary of all employees: " + totalSum);
    }

    public static void main(String[] args) {
        // Create 3 objects of type Employee and input information about them
        Employee employee1 = new Employee();
        employee1.setName("John Doe");
        employee1.setRate(15.50);
        employee1.setHours(40);

        Employee employee2 = new Employee("Jane Smith", 20.25, 35);

        Employee employee3 = new Employee();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter information for employee 3:");
        System.out.print("Name: ");
        employee3.setName(scanner.nextLine());
        System.out.print("Rate: ");
        employee3.setRate(scanner.nextDouble());
        System.out.print("Hours: ");
        employee3.setHours(scanner.nextDouble());

        // Display information about employees
        System.out.println("\nInformation about employees:");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        // Display total salary
        Employee.displayTotalSalary();
    }
}

