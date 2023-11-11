package com.softserve.homework06.ex02;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack", 25, 25000);
        Developer developer1 = new Developer("John", 28, 35500.54, "Senior QA");
        Employee developer2 = new Developer("Alex", 29, 38056.77,
                "Middle Java developer");
        System.out.println(employee1.report());
        System.out.println(developer1.report());
        System.out.println(developer2.report());
    }
}
