package com.softserve.homework10.ex02;
import java.sql.SQLOutput;
import java.util.*;

public class MapOperations<K, V> {

    public void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.printf("Last name: %s, first name: %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }

    public void findDuplicateFirstNames(Map <K, V> map) {
        Set<V> duplicates = new HashSet<>();
        Set<V> uniqueValues = new HashSet<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!uniqueValues.add(entry.getValue())) {
                duplicates.add(entry.getValue());
            }
        }

        System.out.printf("Duplicate first names are: %s%n%n", duplicates);
    }

    public void removeByValue(Map <K, V> map, V value) {
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            if (entry.getValue() == value) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Polishchuk", "Maryna");
        personMap.put("Kovalenko", "Dmytro");
        personMap.put("Shevchenko", "Stanislav");
        personMap.put("Taran", "Olga");
        personMap.put("Bahata", "Natalia");
        personMap.put("Velykyi", "Oleksandr");
        personMap.put("Franko", "Dmytro");
        personMap.put("Dmytrenko", "Oleksandr");
        personMap.put("Kolos", "Anastasiya");
        personMap.put("Prymarna", "Evgeniya");

        MapOperations<String, String> ops = new MapOperations<>();
        ops.printMap(personMap);
        ops.findDuplicateFirstNames(personMap);
        ops.removeByValue(personMap, "Dmytro");
        ops.printMap(personMap);

    }
}
