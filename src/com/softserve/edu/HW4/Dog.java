package com.softserve.edu.HW4;
import java.lang.Enum;


public class Dog {
    private String name;
    private int age;
    private Breed breed; 

    public enum Breed{
        BORDERCOLLIE, DOGGOARGENTINO, FRENCHBULLDOG
    }

    Dog(int age, String name, Breed breed){
        this.age = age;
        this.name = name;
        this.breed = breed;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {// Перевірка на саме себе
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {// Перевірка на null та клас
            return false;
        }
        Dog dog = (Dog) obj;
        return name == dog.name;
    }

    
}
