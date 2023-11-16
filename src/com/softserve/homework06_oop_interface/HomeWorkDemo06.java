package com.softserve.homework06_oop_interface;

import com.softserve.homework06_oop_interface.task01.ContractEmployee;
import com.softserve.homework06_oop_interface.task01.Employee;
import com.softserve.homework06_oop_interface.task01.SalariedEmployee;

import java.util.Arrays;
import java.util.Comparator;

public class HomeWorkDemo06 {
    public static void main(String[] args) {
//        Task 01 Create an interface called Payment with the method calculatePay(), the base
//        abstract class called Employee with a String variable employeeld.
//        o Create two classes, SalariedEmployee and ContractEmployee, which
//        implement Payment interface and inherit from the base class Employee.
//          • Describe hourly-paid workers in the relevant classes (one of the child
//                classes), and fixed paid workers in the other.
//          • Describe the String variable socialSecurityNumber in the
//        SalariedEmployee class .
//          • Include a description of federalTaxIdMember variable in the
//        ContractEmployee class.

        Employee[] employees = {
                new SalariedEmployee("1111", "11-11", "Poll", 5000),
                new SalariedEmployee("2222", "22-22", "Clare", 3000),
                new SalariedEmployee("3333", "33-33", "Luck", 8000),
                new ContractEmployee("5555", "55-55", "John", 140, 40),
                new ContractEmployee("6666", "66-66", "Olaf", 70, 40),
                new ContractEmployee("7777", "77-77", "Tom", 90, 40)
        };
        Arrays.sort(employees);
        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee) {
                System.out.println("Salary of employee with ID: " + employee.getEmployeeId() + " name: " + employee.getName()
                        + " is " +
                        ((SalariedEmployee) employee).calculatePay());
            } else if (employee instanceof ContractEmployee) {
                System.out.println("Salary of employee with ID: " + employee.getEmployeeId() + " name: " + employee.getName()
                        + " is " + ((ContractEmployee) employee).calculatePay());
            }
        }
    }
}
