package com.softserve.homework04.ex5;

public class Dog {
    private String name;
    private Breed breed;
    private double age;

    public Dog(String name, Breed breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed.getBreedName();
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }
}
