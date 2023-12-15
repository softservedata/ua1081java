package com.softserve.edu.HW6.Task2;

public class Developer extends Employee{
    private String name;
    private int age;
    private double salary;

    public Developer(String name, int age, double salary) {
        //super(name, age, salary);
        this.name = name;
        this.age = age;
        this.salary = salary; 
    }

    @Override
    public String report(){
        return String.format("Name: "+ name +", Age: "+ age +", " +
                "Position: Average Java Developer, " +
                "Salary: " + salary);

    }
    
}
