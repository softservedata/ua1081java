package com.softserve.practical03.ex02;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jake", 5, 160);
        Employee employee2 = new Employee("Alex", 4, 170);
        Employee employee3 = new Employee("Trent", 3, 180);
        double totalSalary = Employee.totalSum;

        System.out.printf("Total salary of 3 employees is %.2f USD%n", totalSalary);

        System.out.printf("Salary of %s is %.2f USD%n", employee1.getName(), employee1.getSalary());

        System.out.printf("Bonus of %s is %.2f USD%n", employee1.getName(),
                employee1.getBonus(employee1.getSalary()));

        System.out.println(employee1);

    }
}
