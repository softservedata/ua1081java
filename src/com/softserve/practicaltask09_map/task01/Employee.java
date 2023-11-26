package com.softserve.practicaltask09_map.task01;

public class Employee {
    private String name;
    private String position;
    private double salary;
    private String dateOfBirth;

    public Employee(String name, String position, double salary, String dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public Employee(String name) {
        this.name = name;

    }

    public Employee() {

    }

    public Employee(String s, String value) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
