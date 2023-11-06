package com.softserve.Homework07.Task1;

public class ContractEmployee extends Employee {
    private double pay;
    private int workingDays;
    public ContractEmployee(double pay, int workingDays, String federalTaxIdMember) {
        super(federalTaxIdMember);
        this.pay = pay;
        this.workingDays = workingDays;
    }
    @Override
    public String toString() {
        return "\n\tContractEmployee{" +
                "pay=" + pay +
                ", workingDays=" + workingDays +
                ", federalTaxIdMember=" + super.toString() +
                '}' + "\n\t salary = " + calculatePay();
    }
    @Override
    public int compareTo(Employee obj) {
        return (int) -(this.calculatePay() - obj.calculatePay());
    }
    @Override
    public double calculatePay() {
        return pay * workingDays;
    }

}
