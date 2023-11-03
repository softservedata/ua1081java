package practical5.p4;

import java.util.Scanner;

class Employee {

    String name;
    int departmentNumber;
    int salary;

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Employee[] employees = new Employee[]{
                new Employee("Bob", 1, 3000),
                new Employee("Lili", 2, 3300),
                new Employee("Anna", 3, 2900),
                new Employee("Oleg", 1, 2700),
                new Employee("Petro", 2, 3500)};
        Employee temp;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department number: ");
        int departmentNumber = sc.nextInt();

        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println("Employee " + employee.getName() + " work at " + employee.getDepartmentNumber() + " department. And have " + employee.getSalary() + " salary.");
            }
        }

        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;

                }
            }
        }
        for (Employee employee : employees){
            System.out.println(employee);
        }

    }
}