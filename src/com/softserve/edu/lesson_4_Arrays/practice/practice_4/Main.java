package com.softserve.edu.lesson_4_Arrays.practice.practice_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
                new Employee("Igor", 3, 2650),
                new Employee("Nazar", 2, 3300),
                new Employee("Ira", 2, 5800),
                new Employee("Roman", 1, 2100)};
        Employee temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter num of department ");
        int depart = sc.nextInt();
        for (Employee employee : employees) {
            if (employee.getDepartmentNum() == depart) {
                System.out.println("This is employee " + employee.getName() + " works in department " + employee.getDepartmentNum());
            }
        }
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalsary() < employees[j].getSalsary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }

        }
        System.out.println();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
