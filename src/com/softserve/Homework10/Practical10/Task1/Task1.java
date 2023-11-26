package com.softserve.Homework10.Practical10.Task1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<>();
        employeeMap.put(125,"Eva");
        employeeMap.put(7531,"Diego");
        employeeMap.put(5,"Cago");
        employeeMap.put(74631,"Fiora");
        employeeMap.put(0157,"Giga");
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter id to check: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println(getID(employeeMap,id));
        System.out.print(" Enter name to check: ");
        String name = scanner.nextLine();
        System.out.println(getName(employeeMap,name));
        entry(employeeMap);
    }
    public static void entry(Map<Integer,String> map){
        Scanner scanner = new Scanner(System.in);
        int id;
        String name;
        do {
            System.out.println(" Enter id:");
            id = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" Enter name:");
            name = scanner.nextLine();
        }while (!map.containsKey(id)&&!map.containsValue(name));
    }
    public static boolean getID(Map<Integer,String> map, int id){
        for (Map.Entry<Integer, String> element: map.entrySet()) {
            if(element.getKey()==id){
                System.out.println("Employee name for ID " + id + ": " + element.getValue());
                return true;
            }
        }
        return map.containsKey(id);
    }
    public static boolean getName(Map<Integer,String> map, String name){
        for (Map.Entry<Integer, String> element: map.entrySet()) {
            if(element.getValue().equals(name)){
                System.out.println("Employee ID for name " +  name + ": " + element.getKey());
                return true;
            }
        }
        return map.containsValue(name);
    }
}
