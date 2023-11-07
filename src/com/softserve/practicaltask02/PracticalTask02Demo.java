package com.softserve.practicaltask02;

import com.softserve.practicaltask02.practask01.PracticalTask01;
import com.softserve.practicaltask02.practask02.Employee;

public class PracticalTask02Demo {
    public static void main(String[] args) {
//          Task 01  Write a Java console application with methods that accept two numbers as arguments and
//          have the following names:
//          • getTotal - returns their sum;
//          • getAverage - returns their average;
//          • (*) static getNumber(String prompt) - allows input of numbers using Scanner with
//          messages and return number

        System.out.println(PracticalTask01.getTotal(5, 10));
        System.out.println(PracticalTask01.getAverage(5, 10));
        PracticalTask01.getNumber();

//        Task 02 Create class called Employee that should consist of:
//          • three private fields: name, rate and hours;
//          • a static field called totalSum
//          • properties to access these fields;
//          • a default constructor and two constructors with parameters;
//          • Methods:
//              o getSalary() - to calculate the salary of an employee (formula rate * hours);
//              o toString() - to output information about the employee;
//              o getBonuses() – to calculate 10% from salary.
//                  In the main() method create 3 objects of type Employee, input information about them.
//                  Display the total salary of all employees to the console.

        Employee employee1 = new Employee();
        employee1.setName("Nik");
        employee1.setRate(5);
        employee1.setHours(160);
        double salary1 = employee1.getSalary();
        double bonuses1 = employee1.getBonuses();
        double totalSalary1 = salary1 + bonuses1;
        System.out.println(employee1);

        Employee employee2 = new Employee(20, 160);
        employee2.setName("John");
        double salary2 = employee2.getSalary();
        double bonuses2 = employee2.getBonuses();
        double totalSalary2 = salary2 + bonuses2;
        System.out.println(employee2);

        Employee employee3 = new Employee("Bill", 10, 180);
        double salary3 = employee3.getSalary();
        double bonuses3 = employee3.getBonuses();
        double totalSalary3 = salary3 + bonuses3;
        System.out.println(employee3);

        Employee.totalSum = totalSalary1 + totalSalary2 + totalSalary3;
        System.out.println("Total salary of all employees: " + Employee.totalSum);
    }
}
