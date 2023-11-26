package com.softserve.homework09_set.task02;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
//        Task 02 Create a map called personMap and populate it with ten entries of type <String,
//                String>, where each entry corresponds to a person's last name and first name. Display
//        the contents of the map on the screen. Are there at least two persons with the same
//        first name among these ten people? Remove the person from the map whose first
//        name is "Orest" (or any other specified name). Print the resulting map after the
//        removal.

        Map<String, String> personMap = new HashMap<>();
        personMap.put("Vovk", "Ivan");
        personMap.put("Kolesnik", "Petro");
        personMap.put("Tretiak", "Zina");
        personMap.put("Pushko", "Olha");
        personMap.put("Gunko", "Dmytro");
        personMap.put("Sova", "Olha");
        personMap.put("Mykytenko", "Dasha");
        personMap.put("Luga", "Roman");
        personMap.put("Demko", "Kateryna");
        personMap.put("Fedko", "Olha");
        System.out.println(personMap);

        int count = 0;
        String foundIndex = null;
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().equals("Olha")) {
                count++;
                if(count==2){
                    break;
                }
                foundIndex=entry.getKey();
            }
        }
        personMap.remove(foundIndex);

        System.out.println(personMap);
    }
}
