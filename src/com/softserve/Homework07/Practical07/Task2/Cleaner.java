package com.softserve.Homework07.Practical07.Task2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON="CLEANER";
    private double salary;
    public Cleaner( double salary){
        this.salary=salary;
        System.out.println(TYPE_PERSON);
    }
    @Override
    public double salary(){
        return salary;
    }
}
