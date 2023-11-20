package com.softserve.edu.lesson_9_MapSet.practice.prctice_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Roman");
        employeeMap.put(44, "Ira");
        employeeMap.put(2, "Oksana");
        employeeMap.put(54, "Roman");
        employeeMap.put(22, "Vova");
        employeeMap.put(31, "Roksolana");
        employeeMap.put(33, "Roksolana");
        employeeMap.put(3, "");

        addEmployee(employeeMap);
        display(employeeMap);
        showEmployeeByName(employeeMap);
        showEmployeeByID(employeeMap);


    }

    static void display(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID:" + entry.getKey() + " Name:" + entry.getValue());
        }
    }

    static void showEmployeeByID(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc.nextInt();
        if (map.containsKey(id)) {
            String name = map.get(id);
            System.out.println("ID " + id + ": " + name);
        } else {
            System.out.println("ID " + id + " not found.");
        }
    }

    static void showEmployeeByName(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter name");
        String name = sc.nextLine();
        if (map.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(name)) {
                    int key = entry.getKey();
                    System.out.println("ID " + key + ": " + name);
                }
            }
        } else {
            System.out.println("Employee with name " + name + " not found.");

        }
    }

    static void addEmployee(Map<Integer, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add ID:");
        int id = sc.nextInt();
        System.out.println("Please add name:");
        String name = sc.next();
        if (!isDuplicate(map, id, name)) {
            map.put(id, name);
            System.out.println("Employee added");
        } else {
            System.out.println("Error: found duplicate!!");
        }


    }

    private static boolean isDuplicate(Map<Integer, String> map, int empId, String empName) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == empId || entry.getValue().equals(empName)) {
                return true;
            }
        }
        return false;
    }
}
