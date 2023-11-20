package com.softserve.practical08.ex01;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department originalDepartment = new Department("Sales",
                new Department.Address("Kyiv", "Khreshchatyk", 15));
        Department clonedDepartment = (Department) originalDepartment.clone();
        clonedDepartment.getAddress().setCity("Odesa");

        System.out.println(originalDepartment);
        System.out.println(clonedDepartment);
    }
}
