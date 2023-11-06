package com.softserve.Homework07.Practical07.Task1;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            if (i % 2 == 0) {
                animals[i] = new Dog("Dog");
            } else {
                animals[i] = new Cat("Cat");
            }
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println("\n Animal #"+(i+1)+" it's "+animals[i].name());
            animals[i].voice();
            animals[i].feed();

        }
    }
}
