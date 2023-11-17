package com.softserve.homework07.ex01;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdmember;
    private double hourlyRate;
    private double numberOfHours;

    public ContractEmployee(String employeeId, String name, String federalTaxIdmember, double hourlyRate, double numberOfHours) {
        super(employeeId, name);
        this.federalTaxIdmember = federalTaxIdmember;
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getNumberOfHours() {
        return numberOfHours;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    @Override
    public double calculatePay() {
        return hourlyRate*numberOfHours;
    }

    @Override
    public String toString() {
        return String.format("Contract employee named %s, id = %s, monthly wage of %s%n",
                getName(), getEmployeeId(), calculatePay());
    }
}
