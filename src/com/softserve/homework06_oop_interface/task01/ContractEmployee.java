package com.softserve.homework06_oop_interface.task01;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private String name;
    private int hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdMember, String name, int hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int calculatePay() {
        return getHoursWorked() * getHourlyRate();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public int compareTo(Employee employee) {
        return -calculatePay() + ((Payment) employee).calculatePay();
    }
}
