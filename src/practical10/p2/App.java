package practical10.p2;

import java.util.*;


public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Employee> myMap = new HashMap<>();
        myMap.put(101, new Employee(101, "Ivan", "Manager", 20000.0, 15));
        myMap.put(102, new Employee(102, "Petro", "Developer", 21000.0, 20));
        myMap.put(103, new Employee(103, "Bob", "Designer", 22000.0, 10));
        myMap.put(104, new Employee(104, "Oleg", "Analyst", 23000.0, 3));
        myMap.put(105, new Employee(105, "Igor", "Engineer", 19000.0, 25));
        myMap.put(106, new Employee(106, "Eva", "Tester", 24000.0, 8));
        myMap.put(107, new Employee(107, "Taras", "Manager", 17000.0, 18));

        checkDuplicate(myMap);
        change(myMap);
        sort(myMap);


    }

    private static void sort(Map<Integer, Employee> myMap) {
        System.out.println("Enter what criteria you want to sort by: ID/Name/Position? ");
        String criteria = scanner.nextLine().toLowerCase();
        List<Employee> employees = new ArrayList<>(myMap.values());

        switch (criteria) {
            case "id":
                System.out.println("Sorted by ID: ");
                employees.sort(new Employee.ById());
                System.out.println(employees);
                break;
            case "name":
                System.out.println("Sorted by Name: ");
                employees.sort(new Employee.ByName());
                System.out.println(employees);
                break;
            case "position":
                System.out.println("Sorted by Position: ");
                employees.sort(new Employee.ByPosition());
                System.out.println(employees);
                break;
            default:
                System.out.println("You entered wrong criteria");
        }
    }

    private static void change(Map<Integer, Employee> myMap) {
        System.out.println("Enter ID which you want to change: ");
        int idToChange = scanner.nextInt();
        scanner.nextLine();
        if (myMap.containsKey(idToChange)) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter position: ");
            String position = scanner.nextLine();
            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.println("Enter dayBirthday: ");
            int dayBirthday = scanner.nextInt();
            myMap.replace(idToChange, new Employee(idToChange, name, position, salary, dayBirthday));
        } else {
            System.out.println("This ID is not in the map");
        }
        System.out.println(myMap);
    }

    private static void checkDuplicate(Map<Integer, Employee> myMap) {
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        if (myMap.containsKey(id)) {
            System.out.println("This ID is already in the map");
        } else {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter position: ");
            String position = scanner.nextLine();
            System.out.println("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.println("Enter dayBirthday: ");
            int dayBirthday = scanner.nextInt();
            myMap.put(id, new Employee(id, name, position, salary, dayBirthday));
        }
        System.out.println(myMap);
    }
}