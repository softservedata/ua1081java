package com.softserve.Homework07.Practical07.Task2;

public class Teacher extends Staff{
    private final String TYPE_PERSON="TEACHER";
private double salary;
    public Teacher( double salary) {
        this.salary = salary;
        System.out.println(TYPE_PERSON);
    }
    @Override
    public double salary(){
        return salary;
    }
}
