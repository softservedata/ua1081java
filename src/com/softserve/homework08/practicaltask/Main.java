package com.softserve.homework08.practicaltask;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department originalDepartment = new Department("Physics");
        originalDepartment.setAddress(originalDepartment.new Address("Lviv", "SomeStreet", 11));

        Department clonedDepartment = (Department) originalDepartment.clone();
        clonedDepartment.getAddress().setCity("Smila");

        System.out.println(originalDepartment);
        System.out.println(clonedDepartment);
    }
}
