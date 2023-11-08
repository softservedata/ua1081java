package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_2;

public abstract class Staff extends Student{

    public Staff(String name) {
        super(name);
    }
    abstract void salary();
}
