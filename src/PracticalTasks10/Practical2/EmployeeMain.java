package PracticalTasks10.Practical2;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EmployeeMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new TreeMap<>();
        for (int i = 1; i <= 7; i++) {
            addEmployee(employeeMap, scanner);
        }
        sortingMap(employeeMap);

        System.out.println("Enter an ID to edit the corresponding record: ");
        int editID = scanner.nextInt();

        editEmployee(employeeMap, editID, scanner);

        sortingMap(employeeMap);
    }

    private static void addEmployee(Map<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.println("Lets adding new employees:");
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("Such an ID already exists. Employee not added.");
            return;
        }
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter date of birth: ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter position: ");
        String position = scanner.nextLine();

        Employee employee = new Employee(id, name, dateOfBirth, salary, position);
        employeeMap.put(id, employee);
    }

    private static void sortingMap(Map<Integer, Employee> employeeMap) {
        System.out.println("Sorted map of employees by ID: ");
        for (Employee employee : employeeMap.values()){
            System.out.println(employee);
        }
    }
    private static void editEmployee(Map<Integer, Employee> employeeMap, int editID, Scanner scanner){
        if (employeeMap.containsKey(editID)) {
            System.out.println("Enter update details for ID " + editID);
            System.out.println("Enter name: ");
            String editName = scanner.nextLine();
            System.out.print("Enter date of birth: ");
            String editDateOfBirth = scanner.nextLine();
            System.out.print("Enter salary: ");
            int editSalary = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter position: ");
            String editPosition = scanner.nextLine();

            Employee editemployee = employeeMap.get(editID);
            editemployee = new Employee(editID, editName, editDateOfBirth, editSalary, editPosition);
            employeeMap.put(editID, editemployee);

            System.out.println("Record with ID " + editID + " has been updated.");
        } else {
            System.out.println("Id not found.");
        }
    }
}
