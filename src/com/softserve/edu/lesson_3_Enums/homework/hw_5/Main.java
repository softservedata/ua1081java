package com.softserve.edu.lesson_3_Enums.homework.hw_5;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Dog bars = new Dog();
        bars.setName("Max");
        bars.setBreed(Breed.BULLDOG);
        bars.setAge(8);

        Dog vinil = new Dog("Vinil", Breed.BEAGLE, 8);
        Dog srBars = new Dog("Max", Breed.POODLE, 10);


        uniqueName(bars, vinil, srBars);
        oldestDog(bars, vinil, srBars);

    }
//next both methods better to move to Dog class
    public static void oldestDog(Dog dog_1, Dog dog_2, Dog dog_3) {
        if (dog_1.getAge() >= dog_2.getAge() && dog_1.getAge() >= dog_3.getAge()) {
            System.out.println(dog_1.getName() + " it is oldest dog and has breed " + dog_1.getBreed());
        } else if (dog_2.getAge() > dog_1.getAge() && dog_2.getAge() > dog_3.getAge()) {
            System.out.println(dog_2.getName() + " it is oldest dog and has breed " + dog_2.getBreed());
        } else {
            System.out.println(dog_3.getName() + " it is oldest dog and has breed " + dog_3.getBreed());
        }
    }

    public static void uniqueName(Dog dog_1, Dog dog_2, Dog dog_3) {
        if ((dog_1.getName().equals(dog_2.getName())) || (dog_1.getName().equals(dog_3.getName())) || (dog_2.getName()).equals(dog_3.getName())) {
            System.out.println("The dogs have the same name");
        } else {
            System.out.println("All names are unique");
        }
    }

}

