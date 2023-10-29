package com.softserve.homework04.ex5;

public class DogChecker {
    public static void main(String[] args) {
        Dog dog1 = new Dog("James", Breed.SHEPHERD, 3.4);
        Dog dog2 = new Dog("Charlie", Breed.POODLE, 5);
        Dog dog3 = new Dog("Charlie", Breed.HUSKY, 2);

        //checking same names
        boolean hasSameDogNames = false;
        if (dog1.getName().equals(dog2.getName())) {
            hasSameDogNames = true;
        } else if (dog1.getName().equals(dog3.getName())) {
            hasSameDogNames = true;
        } else if (dog2.getName().equals(dog3.getName())) {
            hasSameDogNames = true;
        }

        if (hasSameDogNames) {
            System.out.println("There are two dogs with the same name");
        } else
            System.out.println("There are no two dogs with the same name");

        //defining the oldest dog
        Dog oldestDog = dog1;

        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }

        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.printf("The oldest dog is %s, breed of %s", oldestDog.getName(), oldestDog.getBreed());
    }
}
