package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_1;

public class SalariedEmployee extends Employee implements Payment {
private String name;
    private String socialSecurityNumber;
    private int rate;

    public SalariedEmployee(String employeeld, String name, String socialSecurityNumber, int rate) {
        super(employeeld);
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.rate = rate;
    }


    @Override
    public int calculatePay() {
        return rate;
    }

    @Override
    String getName() {
        return name;
    }
}
