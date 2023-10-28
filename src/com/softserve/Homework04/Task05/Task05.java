package com.softserve.Homework04.Task05;

import static com.softserve.Homework04.Task05.Dog.Breeds.*;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("******* Task 5 *******");
        Dog[] dogs = {new Dog("Chibi", POODLE, 2),
                new Dog("Bobik", LABRADOR, 0),
                new Dog("Patron", BEAGLE, 1)};
        Dog oldestDog = dogs[0];
        for (int i = 0; i < dogs.length; i++) {
            for (int j = i + 1; j < dogs.length; j++) {
                if (dogs[i].getName().equals(dogs[j].getName())) {
                    System.out.println(" Dog #" + (i + 1) + " and Dog #" + (j + 1) + " have the same names!");
                }
            }
            if (oldestDog.getAge() < dogs[i].getAge()) {
                oldestDog = dogs[i];
            }
        }
        System.out.println(" " + oldestDog.getName() + " is the oldest dog ( " + oldestDog.getAge() + " years )");
    }
}
