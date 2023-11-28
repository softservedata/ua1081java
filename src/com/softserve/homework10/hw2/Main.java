package com.softserve.homework10.hw2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Onoprienko", "Orest");
        personMap.put("Petrenko", "Myron");
        personMap.put("Svitlychna", "Hanna");
        personMap.put("Konopelko", "Orest");
        personMap.put("Ihnatenko", "Nataliia");
        personMap.put("Kvitka", "Taras");
        personMap.put("Sonyachna", "Svitlana");
        personMap.put("Shevchenko", "Irena");
        personMap.put("Sopilka", "Panas");
        personMap.put("Levchenko", "Panas");

        System.out.println("Original Map: " + personMap);

        Map<String, Integer> uniqueNames = new HashMap<>();

        for(Map.Entry<String, String> map : personMap.entrySet()) {
            if (uniqueNames.get(map.getValue()) == null) {
                uniqueNames.put(map.getValue(), 1);
            } else {
                uniqueNames.put(map.getValue(), uniqueNames.get(map.getValue()) + 1);
            }
        }

        for(Map.Entry<String, Integer> map : uniqueNames.entrySet()) {
            if (map.getValue() > 1) {
                System.out.println("A person named " + map.getKey() + " appears in the map " + map.getValue() + " times.");
            }
        }

        System.out.print("Please enter the name of the person you would like to remove from the map: ");

        String nameToBeRemoved = scanner.nextLine();

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if( entry.getValue().equalsIgnoreCase(nameToBeRemoved)) {
                iterator.remove();
            }
        }

        System.out.println("Resulting Map: " + personMap);
    }
}
