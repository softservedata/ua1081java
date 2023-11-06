package com.softserve.homework03.task05.correct;

public class Dog {
    private final String name;
    private final Breed breed;
    private final int age;


    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static Dog findOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        Dog oldest = dog1;
        if (dog2.getAge() > oldest.getAge()) {
            oldest = dog2;
        }
        if (dog3.getAge() > oldest.getAge()) {
            oldest = dog3;
        }
        return oldest;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", Breed.LABRADOR, 5);
        Dog dog2 = new Dog("Buddy", Breed.POODLE, 3);
        Dog dog3 = new Dog("Charlie", Breed.BULLDOG, 7);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("Two dogs have the same name.");
        } else {
            System.out.println("All dogs have unique names.");
        }

        Dog oldest = findOldestDog(dog1, dog2, dog3);

        System.out.println("The oldest dog is " + oldest.getName() + " and is a " + oldest.getBreed());
    }
}

