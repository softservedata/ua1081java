package com.softserve.edu.lesson_6_OOP_Concepts2.homework.hw_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee [] employees = new Employee[6];
        employees[0] = new SalariedEmployee("X2","Ruslan","FX323",15400);
        employees[1] = new SalariedEmployee("X12","Olga","FX444",23421);
        employees[2] = new ContractEmployee("F3","Frank","FC221",320,48);
        employees[3] = new SalariedEmployee("F1","Edik","GB109",33000);
        employees[4] = new ContractEmployee("X43","Veronika","LC300",550,30);
        employees[5] = new ContractEmployee("G4","Rita","FX112",400,35);
        Arrays.sort(employees);

        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getEmployeeld() + " Name: " + employee.getName() + " Salary: " + employee.calculatePay());
        }
    }
}
