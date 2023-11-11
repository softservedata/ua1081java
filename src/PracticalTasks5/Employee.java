package PracticalTasks5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.departmentNumber = department;
        this.salary = salary;
    }

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Employee employee1 = new Employee("Bob", 1, 1450);
        Employee employee2 = new Employee("John", 2, 990);
        Employee employee3 = new Employee("Elena", 1, 1600);
        Employee employee4 = new Employee("Steve", 3, 785);
        Employee employee5 = new Employee("Nick", 2, 920);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        System.out.print("Enter department number to filter employees: ");
        int targetDepartment = scanner.nextInt();
        filterEmployeesByDepartment(employees, targetDepartment);

        sortBySalaryDescending(employees);
        System.out.println("Employees arranged by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee.name + ": Salary - " + employee.salary + " $");
        }
    }

    public static void filterEmployeesByDepartment(Employee[] employees, int departmentNumber) {
        System.out.println("Employees of Department " + departmentNumber + ":");
        for (Employee employee : employees) {
            if (employee.departmentNumber == departmentNumber) {
                System.out.println(employee.name + ": Salary - " + employee.salary + "$");
            }
        }
    }

    private static void sortBySalaryDescending(Employee[] employees) {
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed());
    }

    public double getSalary() {
        return salary;
    }
}

