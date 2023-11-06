package com.softserve.Homework07.Practical07.Task2;

public abstract class Staff extends Person{
    @Override
    public void print(){
        System.out.println(" I'm staff\n My salary = " +salary());
    }

    public abstract double salary();
}
