package com.softserve.homework08;

public class ContractEmployee extends Employee implements Payment {
    private int payment;

    public ContractEmployee(String name, int payment) {
        super(name);
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    public int calculatePay() {
        return  getPayment();
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "payment=" + payment +
                '}';
    }

    /*
    @Override
    public int compareTo(Employee emp) {
        return calculatePay() - ((Payment) emp).calculatePay();
    }
    */
}
