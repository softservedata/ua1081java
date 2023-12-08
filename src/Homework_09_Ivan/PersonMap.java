/*
2. Create a map called personMap and populate it with ten entries of type <String, String>,
where each entry corresponds to a person's last name and first name. Display the contents of the map on the screen.
Are there at least two persons with the same first name among these ten people?
Remove the person from the map whose first name is "Orest" (or any other specified name).
Print the resulting map after the removal.
 */

package Homework_09_Ivan;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        // Step 1: Create a map called personMap
        Map<String, String> personMap = new HashMap<>();

        // Step 2: Populate the map with ten entries of type <String, String>
        personMap.put("Doe", "John");
        personMap.put("Smith", "Jane");
        personMap.put("Johnson", "Mike");
        personMap.put("Davis", "Emily");
        personMap.put("Brown", "Orest");
        personMap.put("Wilson", "Sarah");
        personMap.put("Anderson", "Orest");
        personMap.put("Miller", "Emma");
        personMap.put("Taylor", "Oscar");
        personMap.put("Clark", "Orest");

        // Step 3: Display the contents of the map on the screen
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        // Step 4: Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = checkDuplicateFirstName(personMap);
        System.out.println("Are there at least two persons with the same first name? " + hasDuplicateFirstName);

        // Step 5: Remove the person from the map whose first name is "Orest"
        removePersonByFirstName(personMap, "Orest");

        // Step 6: Print the resulting map after the removal
        System.out.println("\nMap after removing the person with first name 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }

    // Helper method to check if there are at least two persons with the same first name
    private static boolean checkDuplicateFirstName(Map<String, String> personMap) {
        // Create a new map to store the count of each first name
        Map<String, Integer> firstNameCountMap = new HashMap<>();

        // Iterate through the personMap and count the occurrence of each first name
        for (String firstName : personMap.values()) {
            firstNameCountMap.put(firstName, firstNameCountMap.getOrDefault(firstName, 0) + 1);
        }

        // Check if any first name occurs more than once
        for (int count : firstNameCountMap.values()) {
            if (count > 1) {
                return true;
            }
        }

        return false;
    }

    // Helper method to remove the person from the map by first name
    private static void removePersonByFirstName(Map<String, String> personMap, String firstName) {
        // Iterate through the personMap using an iterator
        // and remove the person with the specified first name
        personMap.entrySet().removeIf(entry -> entry.getValue().equals(firstName));
    }
}