/*
1. Create an interface called Payment with the method calculatePay(),
the base abstract class called Employee with a String variable employeeld.
o Create two classes, SalariedEmployee and ContractEmployee,
which implement Payment interface and inherit from the base class Employee.
• Describe hourly-paid workers in the relevant classes (one of the child
classes), and fixed paid workers in the other.
• Describe the String variable socialSecurityNumber in the SalariedEmployee class .
•Include a description of federalTaxIdmember variable in the ContractEmployee class.
 */

package Homework_06_Ivan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Payment {
    double calculatePay();
}

abstract class Employee {
    String employeeId;
    String name;

    Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract method to calculate pay, to be implemented by subclasses
    public abstract double calculatePay();
}

class ContractEmployee extends Employee implements Payment {
    String federalTaxIdMember;
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String employeeId, String name, String federalTaxIdMember, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double fixedMonthlyPayment;

    SalariedEmployee(String employeeId, String name, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }
}

class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees with different forms of payment
        employees.add(new ContractEmployee("C001", "John Doe", "FTID001", 15.0, 160));
        employees.add(new SalariedEmployee("S001", "Jane Smith", "SSN001", 2500.0));
        employees.add(new ContractEmployee("C002", "Alice Johnson", "FTID002", 18.0, 140));
        employees.add(new SalariedEmployee("S002", "Bob Brown", "SSN002", 3000.0));

        // Sort employees in descending order of average monthly wage
        Collections.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        // Output employee ID, name, and average monthly wage
        for (Employee employee : employees) {
            double avgMonthlyWage = employee.calculatePay();
            System.out.printf("Employee ID: %s, Name: %s, Avg Monthly Wage: %.2f%n",
                    employee.getEmployeeId(), employee.getName(), avgMonthlyWage);
        }
    }
}



