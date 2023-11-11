package com.softserve.Homework08.Practical08.Task1;

public class Task1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department(" NameDepartment",
                new Department().new Address("Lviv","Bandera",42));
        System.out.println("\n");
        System.out.println(department1);
        Department department2 = (Department) department1.clone();
        department2.setCity("Odessa");
        System.out.println("\n");
        System.out.println(department2);
    }
}
