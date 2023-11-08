package com.softserve.edu.lesson_6_OOP_Concepts2.practice.practice_1;

public class Cat implements Animal{

    private String name;

    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void voice() {
        System.out.println("\nMye mye");
    }

    @Override
    public void feed() {
        System.out.println("Eat whiskas");
    }
}
