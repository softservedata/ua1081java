package com.softserve.homework06_oop_interface.task01;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private String name;
    private int fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, String name, int fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.name = name;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public int calculatePay() {
        return getFixedMonthlyPayment();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", name='" + name + '\'' +
                ", fixedMonthlyPayment=" + fixedMonthlyPayment +
                '}';
    }

    public int compareTo(Employee employee) {
        return -calculatePay() + ((Payment) employee).calculatePay();
    }
}
