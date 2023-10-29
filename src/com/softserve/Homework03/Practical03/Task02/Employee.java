package com.softserve.Homework03.Practical03.Task02;

public class Employee {
    private String name;
    private double rate;
    private short hours;
    private double salary;
    static double totalSum;

    public Employee() {
    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, short hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setHours(short hours) {
        this.hours = hours;
    }

    public double getSalary() {
        salary = rate * hours;
        totalSum += salary;
        return salary;
    }

    public double getBonuses() {
        return salary * 0.1;
    }

    @Override
    public String toString() {
        return "\n •Employee \n" +
                "Name: " + name +
                "\nRate: " + rate +
                "\nHours: " + hours +
                "\nSalary: " + getSalary() +
                "\nBonuses: " + getBonuses();
    }
}
