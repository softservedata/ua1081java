package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_1;


 abstract class Employee implements Payment,Comparable<Employee>{
    private String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

     public String getEmployeeld() {
         return employeeld;
     }

    abstract String getName();


     @Override
     public int compareTo(Employee o) {
         return Integer.compare(o.calculatePay(),this.calculatePay());
     }
 }
