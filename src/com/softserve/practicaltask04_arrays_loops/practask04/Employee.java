package com.softserve.practicaltask04_arrays_loops.practask04;

import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;
    static Scanner scanner = new Scanner(System.in);

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }


    public static void getAllEmployeesOfCertainDepartment(Employee employee1, Employee employee2, Employee employee3, Employee employee4, Employee employee5) {
        System.out.println("Enter  department number: ");
        int num = scanner.nextInt();
        Employee[] array = new Employee[]{employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < array.length; i++) {
            if (num == array[i].getDepartmentNumber()) {
                System.out.println(array[i]);
            }
        }
    }

    public static void displayEmployeeSalaryInDescendingOrder(Employee employee1, Employee employee2, Employee employee3, Employee employee4, Employee employee5) {
        Employee[] array = new Employee[]{employee1, employee2, employee3, employee4, employee5};
        double temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].getSalary() < array[j].getSalary()) {
                    temp = array[i].getSalary();
                    array[i].setSalary(array[j].getSalary());
                    array[j].setSalary(temp);
                }
            }
        }
        for (Employee employee : array) {
            System.out.println(employee);
        }
    }
}
