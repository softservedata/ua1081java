package Homework7.Homework1;

import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new ContractEmployee("Manager", "23668951", 25, 140));
        employees.add(new ContractEmployee("Rieltor", "15638492", 19, 115));
        employees.add(new SalariedEmployee("Cleaner", 1850));
        employees.add(new SalariedEmployee("Caretaker", 1960));

        Collections.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        System.out.println("Employee Details (Employee ID, Name, Average Monthly Wage):");
        for (Employee employee : employees) {
            System.out.println(employee.employeeId + " " + employee.getClass().getSimpleName() + " " + employee.calculatePay());
        }
    }
}
