package com.softserve.edu.lesson_9_MapSet.practice.prctice_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(22, new Employee("Igor", "Boss", 102300, "10.12.1993"));
        employeeMap.put(2, new Employee("Ira", "Seller", 31000, "02.02.1999"));
        employeeMap.put(34, new Employee("Bogdan", "Seller", 32434, "10.11.1990"));
        employeeMap.put(21, new Employee("Viktoria", "Manager", 55200, "11.01.1995"));
        employeeMap.put(33, new Employee("Roksolana", "Seller", 38900, "04.10.1996"));


        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Please select action:");
            System.out.println("1.Add new employee");
            System.out.println("2.Change employee by ID");
            System.out.println("3.Sort employee");
            System.out.println("4.EXIT");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    Employee.addEmployee(sc, employeeMap);
                    break;
                case 2:
                    Employee.changeEmployee(sc, employeeMap);
                    break;
                case 3:
                    Employee.sortEmployee(sc,employeeMap);
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

}

