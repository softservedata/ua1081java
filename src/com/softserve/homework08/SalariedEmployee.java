package com.softserve.homework08;

public class SalariedEmployee extends Employee implements Payment {

    private int rate;
    private int hours;

    public SalariedEmployee(String name, int rate, int hours) {
        super(name);
        this.rate = rate;
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public int calculatePay() {
        return  getRate() * getHours();
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    /*
    @Override
    public int compareTo(Employee emp) {
        return calculatePay() - ((Payment) emp).calculatePay();
    }
    */
}
