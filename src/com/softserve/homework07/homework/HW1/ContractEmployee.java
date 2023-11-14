package com.softserve.homework07.homework.HW1;

import java.util.Comparator;

public class ContractEmployee extends Employee implements Payment {

    public class ByHourlyRateAsc implements Comparator<ContractEmployee> {
        @Override
        public int compare(ContractEmployee emp1, ContractEmployee emp2) {
            if(emp1.getHourlyRate() < emp2.getHourlyRate())
                return -1;
            else if(emp1.getHourlyRate() > emp2.getHourlyRate())
                return 1;
            return 0;
        }
    }

    private String federalTaxIdNumber;
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee() {
        super();
    }

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
        return "Contract Employee Info:\n\tName: " + getName() +
                "\n\tID: " + getEmployeeId() +
                "\n\tSocial Security Number: " + federalTaxIdNumber +
                "\n\tHourly Rate: " + hourlyRate +
                "\n\tAverage Monthly Salary: " + getAverageMonthlySalary();
    }
}
