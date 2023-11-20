package practical10.p1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new TreeMap<>();
        employeeMap.put(123, "Petro");
        employeeMap.put(321, "Ivan");
        employeeMap.put(456, "Oleg");
        employeeMap.put(654, "Pavlo");
        employeeMap.put(789, "Vasul");
        employeeMap.put(987, "Taras");
        employeeMap.put(147, "Andriy");

        displayMap(employeeMap);
        Scanner scanner = new Scanner(System.in);

        checkNameToId(scanner, employeeMap);

        checkIDToName(scanner, employeeMap);

        displayMap(employeeMap);


    }

    private static void checkNameToId(Scanner scanner, Map<Integer, String> employeeMap) {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Your name is: " + employeeMap.get(id));
        } else System.out.println(" Your key: " + employeeMap.containsKey(id));
    }
    private static void displayMap(Map<Integer, String> employeeMap) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
    private static void checkIDToName(Scanner scanner, Map<Integer, String> employeeMap) {
        System.out.println("Enter name: ");
        String name = scanner.next();
        Integer key = 0;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                key = entry.getKey();
            }
        }
        if (employeeMap.containsValue(name)) {
            System.out.println("Your ID is: " + key);
        } else System.out.println(" Your name: " + employeeMap.containsValue(name));
    }




}