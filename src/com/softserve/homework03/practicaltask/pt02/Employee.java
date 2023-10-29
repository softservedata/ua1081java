package com.softserve.homework03.practicaltask.pt02;

public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double totalSum;

    public Employee() {
    }

    public Employee(double rate, int hours) {
        this.rate = rate;
        this.hours = hours;
    }

    public Employee(String name, double rate, int hours) {
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public static void setTotalSum(double totalSum) {
        Employee.totalSum = totalSum;
    }

    @Override
    public String toString() {
        return "Employee Information:\n    Name: '" + name + '\'' +
                "\n    Rate: " + rate +
                "\n    Hours: " + hours;
    }

    public double getSalary() {
        return this.rate * this.hours;
    }

    public double getBonuses() {
        return (this.getSalary() * 10) / 100;
    }
}
