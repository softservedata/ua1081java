package com.softserve.Homework05.Practical05.Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("John Doe", 101, 50000.0);
        employees[1] = new Employee("Alice Smith", 102, 60000.0);
        employees[2] = new Employee("Robert Johnson", 103, 55000.0);
        employees[3] = new Employee("Emily Davis", 104, 52000.0);
        employees[4] = new Employee("Michael Wilson", 105, 58000.0);
        System.out.println(" Enter department number: ");
        int departmentNumber = scanner.nextInt();
        printByDepartment(employees, departmentNumber);
        sortArrayBySalary(employees);
        System.out.println(" Array after sort:");
        System.out.println(Arrays.toString(employees));

    }

    public static void printByDepartment(Employee[] employees, int number) {
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == number) {
                System.out.println(employee);
            }
        }
    }

    public static void sortArrayBySalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].getSalary() > employees[j + 1].getSalary()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
}
