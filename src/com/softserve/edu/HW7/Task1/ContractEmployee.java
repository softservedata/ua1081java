package com.softserve.edu.HW7.Task1;

public class ContractEmployee extends Employee implements Payment {
    //private int theAverageMonthlySalary;
    private String federalTaxIdmember;
    final int HOURLY_RATE = 5;
    private int[] numOfHoursWorked;

    ContractEmployee(String employeedId, int[] numOfHoursWorked, String federalTaxIdmember){
        this.employeeId = employeedId;
        this.numOfHoursWorked = numOfHoursWorked;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    @Override
    public void calculatePay() {
        double sum = 0;
        double temp = 0;
        for (double h : numOfHoursWorked) {
            temp = h * HOURLY_RATE;

            sum += temp;
        }
        theAverageMonthlySalary = (int) (sum / numOfHoursWorked.length);
        System.out.println("calculatePay from ContractEmployee class working");
        System.out.println("theAverageMonthlySalary is " + theAverageMonthlySalary);
    }
    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }
    public int getTheAverageMonthlySalary() {
        return theAverageMonthlySalary;
    }
}
