package homework10.h2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Petrenko", "Petro");
        personMap.put("Ivaniv", "Ivan");
        personMap.put("Olegiv", "Oleg");
        personMap.put("Pavliv", "Pavlo");
        personMap.put("Vasuliv", "Vasul");
        personMap.put("Tarasiv", "Taras");
        personMap.put("Andriiv", "Andriy");
        personMap.put("Oleksandriv", "Oleksandr");
        personMap.put("Oleksiv", "Oleksiy");
        personMap.put("Igoriv", "Ivan");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        findDuplicate(personMap);

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals("Taras")){
                personMap.remove(entry.getKey());
                break;
            }
        }
        System.out.println("After removing");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void findDuplicate(Map<String,String> map){
        Set<String>uniqueValue =new HashSet<>();
        Set<String>duplicateValue= new HashSet<>();
        for (String value : map.values()){
            if (!uniqueValue.add(value)){
                duplicateValue.add(value);
            }
        }
        System.out.println("Duplicate name is: ");
        for (String duplicate: duplicateValue){
            System.out.println(duplicate);
        }
    }
}