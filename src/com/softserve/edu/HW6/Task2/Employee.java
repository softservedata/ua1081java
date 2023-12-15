package com.softserve.edu.HW6.Task2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {
    }

    public String report(){
        return String.format("Name: "+ name +", Age: "+ age +", " +
                "Salary: " + salary);
    }
    
}
