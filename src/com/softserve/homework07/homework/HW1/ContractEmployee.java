package com.softserve.homework07.homework.HW1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdNumber;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, String employeeId) {
        super(name, employeeId);
    }

    public ContractEmployee(String name, String employeeId, String federalTaxIdNumber, double hourlyRate, int hoursWorked) {
        super(name, employeeId);
        this.federalTaxIdNumber = federalTaxIdNumber;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdNumber() {
        return federalTaxIdNumber;
    }

    public void setFederalTaxIdNumber(String federalTaxIdNumber) {
        this.federalTaxIdNumber = federalTaxIdNumber;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        setAverageMonthlySalary(hourlyRate * hoursWorked);
    }

    @Override
    public String toString() {
        return "Contract Employee Info:\n    Name: " + getName() +
                "\n    ID: " + getEmployeeId() +
                "\n    Social Security Number: " + federalTaxIdNumber +
                "\n    Average Monthly Salary: " + getAverageMonthlySalary();
    }
}
