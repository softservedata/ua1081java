package com.softserve.homework08;

public class App {

    public static void main(String[] args) {
        Employee e1 = new SalariedEmployee("Ivan", 2, 4);
        Employee e2 = new ContractEmployee("Ivan", 9);
        //
        System.out.println("e1.compareTo(e2) = " + e1.compareTo(e2));
    }
}
