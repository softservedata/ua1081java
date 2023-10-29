package com.softserve.edu.lesson_2_OOP.practice.practice_1;

public class Main {
    public static void main(String[] args) {
        // Employee with all fields is created and all employee salaries are displayed.

        Employee ivan = new Employee("Ivan", 22.4, 48);
        Employee ira = new Employee("Ira", 18.6, 36);
        Employee nazar = new Employee("Nazar", 36.90, 22);


        double ivanSalary = Employee.getSalary(ivan);
        double iraSalary = Employee.getSalary(ira);
        double nazarSalary = Employee.getSalary(nazar);

        Employee.getBonuses(ivanSalary);
        Employee.getBonuses(iraSalary);
        Employee.getBonuses(nazarSalary);

        Employee.totalSalary();


    }
}
