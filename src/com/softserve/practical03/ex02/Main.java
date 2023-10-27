package com.softserve.practical03.ex02;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jake", 5, 160);
        Employee employee2 = new Employee("Alex", 3.5, 170);
        Employee employee3 = new Employee("Trent", 7.5, 180);
        double totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();

        System.out.printf("Total salary of 3 employees is %.2f USD%n", totalSalary);

        System.out.printf("Salary of %s is %.2f USD%n", employee1.getName(), employee1.getSalary());

        System.out.printf("Bonus of %s is %.2f USD%n", employee1.getName(),
                employee1.getBonus(employee1.getSalary()));

        System.out.println(employee1);

    }
}
