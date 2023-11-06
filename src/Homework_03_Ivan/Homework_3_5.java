/*
5.* Create a class called Dog that has the following fields: name, breed, age.
• Declare enum for field breed.
• In main() method create create three instances of type Dog.
Check if there are no two dogs with the same name;
Output the name and the breed of the oldest dog.
 */

package Homework_03_Ivan;

import java.util.ArrayList;
import java.util.List;

public class Homework_3_5 {
    public static void main(String[] args) {
        List<String> dogNames = new ArrayList<>();
        Dog dog1 = new Dog("Buddy", Dog.Breed.LABRADOR, 3);
        if (containsDuplicateName(dogNames, dog1.getName())) {
            System.out.println("Duplicate name: " + dog1.getName());
            return;
        }
        dogNames.add(dog1.getName());

        // Exit the program if there's a duplicate name
        Dog dog2 = new Dog("Max", Dog.Breed.BULLDOG, 10);
        if (containsDuplicateName(dogNames, dog2.getName())) {
            System.out.println("Duplicate name: " + dog2.getName());
            return; // Exit the program if there's a duplicate name
        }
        dogNames.add(dog2.getName());

        Dog dog3 = new Dog("Alice", Dog.Breed.HASKY, 1);
        if (containsDuplicateName(dogNames, dog3.getName())) {
            System.out.println("Duplicate name: " + dog3.getName());
            return; // Exit the program if there's a duplicate name
        }
        dogNames.add(dog3.getName());


        Dog oldestDog = dog1;
    if(dog2.getAge()>oldestDog.getAge()) {
        oldestDog = dog2;
    }
    if(dog3.getAge()>oldestDog.getAge()) {
        oldestDog = dog3;
    }

    System.out.println("The oldest dog is "+oldestDog.getName()+" ("+oldestDog.getBreed()+") + "+oldestDog.getAge() + "y.o");
}

    private static boolean containsDuplicateName(List<String> names, String name) {
        return names.contains(name);
    }

    public static class Dog{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Breed getBreed() {
            return breed;
        }

        public void setBreed(Breed breed) {
            this.breed = breed;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        private Breed breed;
        private int age;

        public Dog (String name, Breed breed, int age) {
            this.name = name;
            this.breed = breed;
            this.age = age;
        }

        public enum Breed {
            LABRADOR,
            GOLDEN_RETRIEVER,
            GERMAN_SHEPHERD,
            BEAGLE,
            BULLDOG,
            POODLE,
            HASKY,
            AKITA,
            ROTWEILER,
            BULLMASTIFF;

        }
    }

}
