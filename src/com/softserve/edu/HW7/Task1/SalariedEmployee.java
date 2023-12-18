package com.softserve.edu.HW7.Task1;

public class SalariedEmployee extends Employee implements Payment {
    //private int theAverageMonthlySalary;
    private int fixedMonthlyPayment;
    private String socialSecurityNumber;

    SalariedEmployee(String employeedId, int fixedMonthlyPayment, String socialSecurityNumber){
        this.employeeId = employeedId;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public void calculatePay() {
        theAverageMonthlySalary = fixedMonthlyPayment;
        System.out.println("calculatePay from SalariedEmployee class working");
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public int getTheAverageMonthlySalary() {
        return theAverageMonthlySalary;
    }
    
}
