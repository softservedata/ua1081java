package com.softserve.Homework10.Task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap<>();
        personMap.put("Smith", "John");
        personMap.put("Johnson", "Alice");
        personMap.put("Brown", "Bob");
        personMap.put("Davis", "Orest");
        personMap.put("Miller", "Jane");
        personMap.put("Wilson", "Ores");
        personMap.put("Moore", "Charlie");
        personMap.put("Taylor", "Eva");
        personMap.put("Anderson", "Oret");
        personMap.put("Clark", "Joh");
        print(personMap);
        System.out.println(" Is same names = "+sameName(personMap));
        removeByName(personMap, "Charlie");
        System.out.println(" New Map:");
        print(personMap);
    }
    public static void print(Map<String,String> personMap){
        System.out.println(" Print Map:");
        for (Map.Entry<String,String> element: personMap.entrySet()) {
            System.out.println(element.getKey()+" "+element.getValue());
        }
    }
    public static void removeByName(Map<String,String> personMap, String name){
        Iterator iterator = personMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry element = (Map.Entry)iterator.next();
            if(element.getValue().equals(name)){
                iterator.remove();
            }
        }
    }
    public static boolean sameName(Map<String,String> personMap){
        for (String key1: personMap.keySet()) {
            for (String key2: personMap.keySet()) {
                if(!key1.equals(key2)&&personMap.get(key1).equals(personMap.get(key2))){
                    return true;
                }
            }
        }
        return false;
    }

}
