package com.softserve.homework07.ex01;

public class SalariedEmployee extends Employee implements Payment {
    private String socialSecurityNumber;
    private int fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public int getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format("Salaried employee named %s, id = %s, monthly wage of %s%n",
                getName(), getEmployeeId(), calculatePay());
    }
}
