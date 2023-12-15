package com.softserve.HomeWorks.HomeWork06Ex2;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f", name, age, salary);
    }

    // Encapsulation: Added getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

class Developer extends Employee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d years, Position: %s, Salary: \u20B4 %.2f",
                getName(), getAge(), position, getSalary());
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 28, 50000.00);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println("Employee Information:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information:");
        System.out.println(developer.report());
    }
}


