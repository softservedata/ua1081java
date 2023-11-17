package com.softserve.practical07.ex01;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
                new Cat("Stan"),
                new Dog("Bro"),
                new Cat("Chad"),
                new Dog("Lazy")
        };

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}
