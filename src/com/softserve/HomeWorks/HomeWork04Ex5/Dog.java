package com.softserve.HomeWorks.HomeWork04Ex5;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {
        LABRADOR,
        GERMAN_SHEPHERD,
        BEAGLE,
        BULLDOG,
        POODLE,
        // Add more breeds as needed
    }

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

    public static void main(String[] args) {
        // Create three instances of type Dog
        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 3);
        Dog dog2 = new Dog("Charlie", Breed.BEAGLE, 5);
        Dog dog3 = new Dog("Buddy", Breed.GERMAN_SHEPHERD, 4);

        // Check if there are no two dogs with the same name
        if (areNamesUnique(dog1, dog2, dog3)) {
            System.out.println("All dogs have unique names.");
        } else {
            System.out.println("There are two dogs with the same name.");
        }

        // Output the name and breed of the oldest dog
        Dog oldestDog = findOldestDog(dog1, dog2, dog3);
        if (oldestDog != null) {
            System.out.println("Oldest dog: " + oldestDog.getName() + " (" + oldestDog.getBreed() + ")");
        } else {
            System.out.println("No dogs to compare.");
        }
    }

    private static boolean areNamesUnique(Dog... dogs) {
        for (int i = 0; i < dogs.length - 1; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    return false;
                }
            }
        }
        return true;
    }

    private static Dog findOldestDog(Dog... dogs) {
        if (dogs.length == 0) {
            return null;
        }

        Dog oldestDog = dogs[0];
        for (int i = 1; i < dogs.length; i++) {
            if (dogs[i].getAge() > oldestDog.getAge()) {
                oldestDog = dogs[i];
            }
        }
        return oldestDog;
    }
}
