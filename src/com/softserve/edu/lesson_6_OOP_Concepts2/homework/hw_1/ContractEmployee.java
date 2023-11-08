package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_1;

class ContractEmployee extends Employee implements Payment{

    private String name;
    private String federalTaxIdmember;
    private int rate;
    private int hours;

    public ContractEmployee(String employeeld, String name, String federalTaxIdmember, int rate, int hours) {
        super(employeeld);
        this.name = name;
        this.federalTaxIdmember = federalTaxIdmember;
        this.rate = rate;
        this.hours = hours;
    }

    @Override
    public int calculatePay() {
        return  rate * hours;
    }

    @Override
    String getName() {
        return name;
    }

}
