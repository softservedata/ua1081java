package PracticalTasks10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(111, "Alex");
        employeeMap.put(112, "Denis");
        employeeMap.put(113, "Ivan");
        employeeMap.put(114, "Sergiy");
        employeeMap.put(115, "Dmitriy");
        employeeMap.put(116, "Anatoliy");
        employeeMap.put(117, "Roman");

        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + "; Name: " + entry.getValue());
        }
        System.out.print("\nEnter an ID to find the corresponding name: ");
        Scanner scanner = new Scanner(System.in);
        int inputID = scanner.nextInt();

        if (employeeMap.containsKey(inputID)) {
            System.out.println("\tName for ID " + inputID + ": " + employeeMap.get(inputID));
        } else {
            System.out.println("ID not found.");
        }

        scanner.nextLine();
        System.out.print("\nEnter a name to find the corresponding ID: ");
        String inputName = scanner.nextLine();
        if (employeeMap.containsValue(inputName)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(inputName)) {
                    System.out.println("\tID for name " + inputName + ": " + entry.getKey());
                }
            }
        } else {
            System.out.println("Name not found.");
        }

    }
}
