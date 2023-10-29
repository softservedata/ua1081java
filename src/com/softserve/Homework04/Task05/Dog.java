package com.softserve.Homework04.Task05;

public class Dog {

    public enum Breeds {
        /* BEAGLE("Beagle"),
         POODLE("Poodle"),
         LABRADOR("Labrador"),
         SHEPHERD("Shepherd");*/
        BEAGLE,
        POODLE,
        LABRADOR,
        SHEPHERD;


    }

    private String name;
    private Breeds breed;
    private int age;

    public Dog(String name, Breeds breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}
