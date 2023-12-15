package com.softserve.edu.HW6.Task2;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Oleg", 30, 5000);
        Developer dev = new Developer("Taras", 25, 10000);
        System.out.println(emp.report());
        System.out.println(dev.report());
    }
    
}
