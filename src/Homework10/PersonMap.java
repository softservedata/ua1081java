package Homework10;

import java.util.*;

public class PersonMap {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Rotar", "Andriy");
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrov", "Petro");
        personMap.put("Apopiy", "Ivan");
        personMap.put("Orestovich", "Orest");
        personMap.put("Zelensky", "Volodimir");
        personMap.put("Lungu", "Denis");
        personMap.put("Istratiy", "Anton");
        personMap.put("Paskar", "Anatoliy");
        personMap.put("Vornik", "Roman");

        System.out.println("Contents of the map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("\tFirst name: " + entry.getValue() + ", Last name: " + entry.getKey());
        }

        boolean duplicatedFirstName = duplicatedFirstName(personMap);
        System.out.println("\nAre there at least two persons with the same first name among these ten people?  " + duplicatedFirstName );

        removePerson(personMap, "Denis");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("\tFirst name: " + entry.getValue() + ", Last name: " + entry.getKey());
        }

    }

    private static boolean duplicatedFirstName(Map<String, String> personMap) {
        Set<String> getFirstName = new HashSet<>();
        for (String firstName : personMap.values()) {
            if (getFirstName.add(firstName)) {

                return true;
            }
        }
        return false;
    }

    private static void removePerson(Map<String, String> personMap, String getFirstName) {
        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getValue().equals(getFirstName)){
                iterator.remove();
                break;
            }
        }
    }
}
