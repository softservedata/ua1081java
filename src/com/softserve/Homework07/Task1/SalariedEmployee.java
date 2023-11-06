package com.softserve.Homework07.Task1;

public class SalariedEmployee extends Employee {
    private double rate;
    private int hours;
    public SalariedEmployee(double rate, int hours, String socialSecurityNumber) {
        super(socialSecurityNumber);
        this.rate = rate;
        this.hours = hours;
    }
    @Override
    public String toString() {
        return "\n\tSalariedEmployee{" +
                "rate=" + rate +
                ", hours=" + hours +
                ", socialSecurityNumber='" + super.toString() + '\'' +
                '}' + "\n\t salary = " + calculatePay();
    }
    @Override
    public double calculatePay() {
        return rate * hours;
    }
    @Override
    public int compareTo(Employee obj) {
        return (int) -(this.calculatePay() - obj.calculatePay());
    }
}
