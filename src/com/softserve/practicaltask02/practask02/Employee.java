package com.softserve.practicaltask02.practask02;

public class Employee {
    private String name;
    private double rate;
    private double hours;
    public static double totalSum;

    public Employee() {
    }

    public Employee(double rate, double hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

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
    }

    public double getSalary() {
        double rate = getRate();
        double hours = getHours();
        double salary = rate * hours;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public double getBonuses() {
        double salary = getSalary();
        double bonuses = (10 * salary) / 100;
        return bonuses;
    }


}
