package com.softserve.Homework07.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        Employee[] employees= new Employee[5];
        employees[0]= new SalariedEmployee(12.2,8,"123456");
        employees[1]= new ContractEmployee(200,30,"654321");
        employees[2]= new SalariedEmployee(9,7,"134679");
        employees[3]= new ContractEmployee(150,15,"235689");
        employees[4]= new SalariedEmployee(20,5,"124578");
        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println("\n Sorted array:\n"+Arrays.toString(employees));
    }
}
