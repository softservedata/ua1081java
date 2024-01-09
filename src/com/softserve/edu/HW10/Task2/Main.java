package com.softserve.edu.HW10.Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static void displayMap(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }

    private static boolean hasDuplicate(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();
        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        return firstNameCount.values().stream().anyMatch(count -> count >= 2);
    }

    private static void removePerson(Map<String, String> map, String firstNameToRemove) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(firstNameToRemove));
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Predator", "Vincent");
        personMap.put("Johnson", "Oliver");
        personMap.put("Predator1", "Person1");
        personMap.put("Doe", "Person1");
        personMap.put("Williams", "Person1");
        personMap.put("Predator2", "Person2");
        personMap.put("Predator3", "Person3");
        personMap.put("Davis", "Orest");
        personMap.put("Predator4", "Orest");
        personMap.put("Predator5", "Person4");

        System.out.println("Original personMap:");
        displayMap(personMap);

        boolean hasDuplicateFirstName = hasDuplicate(personMap);
        System.out.println("At least two persons with the same first name: " + hasDuplicateFirstName);

        
        removePerson(personMap, "Orest");

        System.out.println("PersonMap after removing the person with first name 'Orest':");
        displayMap(personMap);
        
    }
    
}
