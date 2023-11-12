package com.softserve.homework06.homework.HW2;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Semen Starosta", 40, 30456.5);
        Developer developer = new Developer("Taras Taphan", 22, "Junior Java developer", 23456.5);

        System.out.println("Current information about employees:\n\n" +
                employee.report() + "\n" +
                developer.report());

        //Change some values for employee
        employee.setName("Semen Hora");
        employee.setAge(41);
        employee.setSalary(35000.5);

        //Change some values for developer
        developer.setName("Taras Dveri");
        developer.setAge(23);
        developer.setPosition("Middle Java developer");
        developer.setSalary(40635.9);

        System.out.print("\nChanges were made to the personal information of employees.\n" +
                "Now you can see up-to-date information about them: \n\n" +
                employee.report() + "\n" +
                developer.report());
    }
}
