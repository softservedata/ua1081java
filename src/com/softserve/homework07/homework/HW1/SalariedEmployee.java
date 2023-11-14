package com.softserve.homework07.homework.HW1;

import java.util.Comparator;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    public SalariedEmployee(String name, String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(name, employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public void calculatePay() {
        setAverageMonthlySalary(fixedMonthlyPayment);
    }

    @Override
    public String toString() {
        return "Salaried Employee Info:\n\tName: " + getName() +
                "\n\tID: " + getEmployeeId() +
                "\n\tSocial Security Number: " + socialSecurityNumber +
                "\n\tAverage Monthly Salary: " + getAverageMonthlySalary();
    }
}
