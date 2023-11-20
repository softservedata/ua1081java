package com.softserve.edu.lesson_9_MapSet.homework.hw_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Kuku", "Roman");
        personMap.put("Bogdanova", "Olga");
        personMap.put("Voloshkova", "Viktoria");
        personMap.put("Moroz", "Olga");
        personMap.put("Balinskiy", "Orest");
        personMap.put("Kopot", "Mariia");
        personMap.put("Shah", "Dmytro");
        personMap.put("Roza", "Viktoria");
        personMap.put("Mishok", "Orest");
        personMap.put("Vulchin", "Roman");

        display(personMap);
        System.out.println();
        findDuplicate(personMap);
        System.out.println();
        deleteDuplicate(personMap);
    }

    static void display(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Surname:" + entry.getKey() + " Name:" + entry.getValue());
        }
    }

    static void findDuplicate(Map<String, String> map) {
        Set<String> duplicate = new HashSet<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(!duplicate.add(entry.getValue())){
                System.out.println("Duplicate: " + entry.getValue());
            }
        }

    }


    static void deleteDuplicate(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            if (next.getValue().equals("Orest")) {
                iterator.remove();
            }
        }
        System.out.println("After removal " + map);

    }

}

