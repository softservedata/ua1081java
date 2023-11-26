package com.softserve.practicaltask09_map.task01;

import java.util.*;

public class UtilityForMap {


    public static void findUserById(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        int enteredId;
        do {
            System.out.println("Enter user ID: ");
            enteredId = scanner.nextInt();
            if (!map.containsKey(enteredId)) {
                System.out.println("User with this ID not found\n");
            } else {
                for (Iterator<Map.Entry<Integer, String>> i = map.entrySet().iterator(); i.hasNext(); ) {
                    Map.Entry<Integer, String> entry = i.next();
                    if (entry.getKey() == enteredId) {
                        System.out.println("Id: " + entry.getKey() + " name is " + entry.getValue());
                        break;
                    }
                }
            }
        } while (!map.containsKey(enteredId));

    }

    public static void findUserByName(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        String enteredName;
        do {
            System.out.println("Enter user name: ");
            enteredName = scanner.nextLine().toLowerCase();
            enteredName = enteredName.substring(0, 1).toUpperCase() + enteredName.substring(1);
            if (!map.containsValue(enteredName)) {
                System.out.println("User with this name not found\n");
            } else {
                for (Iterator<Map.Entry<Integer, String>> i = map.entrySet().iterator(); i.hasNext(); ) {
                    Map.Entry<Integer, String> entry = i.next();
                    if (entry.getValue().equals(enteredName)) {
                        System.out.println("Id: " + entry.getKey() + " name is " + entry.getValue());
                    }
                }
            }
        } while (!map.containsValue(enteredName));

    }

    public static Map<Integer, String> checkDuplicateValues(Map<Integer, String> map, String enteredName) {
        if (map.containsValue(enteredName)) {
            System.out.println("Entered name is duplicated: " + enteredName);
            return null;
        } else {
            return map;
        }
    }


    public static Map<Integer, Employee> provideMoreComprehensiveInfo(Map<Integer, String> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input additional information: ");
        Integer id = null;

        while (id == null) {
            System.out.println("Enter your ID: ");
            try {
                id = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }

        if (!map.containsKey(id)) {
            System.out.println("Employee with this ID not found\n");
            return Collections.emptyMap();
        }

        System.out.println("Enter your position: ");
        String position = scanner.nextLine();
        System.out.println("Enter your salary: ");
        double salary = 0;
        boolean validSalary = false;

        while (!validSalary) {
            try {
                salary = Double.parseDouble(scanner.nextLine());
                validSalary = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid salary.");
            }
        }

        System.out.println("Your birthDay: ");
        String dateOfBirth = scanner.nextLine();


        Map<Integer, Employee> map1 = new HashMap<>();


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Employee employee;
            if (entry.getKey() == id) {
                employee = new Employee(entry.getValue(), position, salary, dateOfBirth);
                map1.put(id, employee);
            } else {
                employee = new Employee(entry.getValue(), null, 0.0, null);
                map1.put(entry.getKey(), employee);
            }
        }
        return map1;
    }


}






