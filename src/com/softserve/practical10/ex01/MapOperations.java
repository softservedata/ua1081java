package com.softserve.practical10.ex01;

import java.util.*;

public class MapOperations {
    static Scanner sc = new Scanner(System.in);

    static void print(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("\tID: %d, name: %s%n", entry.getKey(), entry.getValue());
        }
    }

    static String getValueByID(Map<Integer, String> map, Integer id) {
        return map.containsKey(id) ? String.format("Value by id %d is %s%n", id, map.get(id)) :
                String.format("There is no id %d in this map%n", id);
    }

    static String getValueByName(Map<Integer, String> map, String value) {
        if (!map.containsValue(value)) return String.format("There is no name of %s in the map", value);

        List<Integer> ids = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                ids.add(entry.getKey());
            }
        }
        return String.format("ID of the input value: %s%n", ids);
    }

    static String findDuplicates(Map<Integer, String> map, Integer id, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(id) && entry.getValue().equals(value)) {
                return String.format("There is a complete duplicate pair of %d - %s in the map%n",
                        id, value);
            }
            if (entry.getKey().equals(id)) {
                return String.format("There is a duplicate id of %d%n", id);
            }
            if (entry.getValue().equals(value)) {
                return String.format("There is a duplicate value of %s%n", value);
            }
        }
        return "";
    }

    static void addRecord(Map<Integer, String> map) {
        System.out.println("Please, input an id and name to add: ");
        Integer id = sc.nextInt();
        sc.nextLine();
        String value = sc.nextLine();
//        sc.nextLine();
        if (map.containsKey(id) || map.containsValue(value)) {
            System.out.println(findDuplicates(map, id, value));
        } else {
            map.put(id, value);
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Paul");
        employeeMap.put(2, "Alex");
        employeeMap.put(3, "Stan");
        employeeMap.put(7, "Jane");
        employeeMap.put(5, "Jane");
        employeeMap.put(4, "May");
        employeeMap.put(6, "Joe");

        print(employeeMap);
//        System.out.println("Please, input an ID: ");
//        Integer inputId = sc.nextInt();
//        sc.nextLine();
//        System.out.println(getValueByID(employeeMap, inputId));
//        System.out.println("Please, input a name: ");
//        String inputName = sc.nextLine();
//        System.out.println(getValueByName(employeeMap, inputName));

        addRecord(employeeMap);
        addRecord(employeeMap);
        addRecord(employeeMap);
        addRecord(employeeMap);
        print(employeeMap);

    }
}
