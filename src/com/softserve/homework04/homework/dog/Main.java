package com.softserve.homework04.homework.dog;

public class Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog();
        firstDog.setName("Alfie");
        firstDog.setBreed(Breed.BEAGLE);
        firstDog.setAge(1);

        Dog secondDog = new Dog("Alba");
        secondDog.setBreed(Breed.DACHSHUND);
        secondDog.setAge(13);

        Dog thirdDog = new Dog("Stepan", Breed.BULLDOG, 13);

        if (firstDog.getName().equals(secondDog.getName()) && firstDog.getName().equals(thirdDog.getName())) {
            System.out.println("All three dogs have the same name.");
        } else if (!firstDog.getName().equals(secondDog.getName()) && !firstDog.getName().equals(thirdDog.getName())) {
            System.out.println("All three dogs have different names.");
        } else if (firstDog.getName().equals(secondDog.getName()) && !firstDog.getName().equals(thirdDog.getName())) {
            System.out.println("The first and second dogs have the same names.");
        } else if (firstDog.getName().equals(thirdDog.getName()) && !firstDog.getName().equals(secondDog.getName())) {
            System.out.println("The first and third dogs have the same names.");
        } else {
            System.out.println("The second and third dogs have the same names.");
        }

        if (firstDog.getAge() == secondDog.getAge() && firstDog.getAge() == thirdDog.getAge()) {
            System.out.println("All three dogs are the same age.");
        } else if (firstDog.getAge() > secondDog.getAge() && firstDog.getAge() > thirdDog.getAge()) {
            System.out.println(firstDog.getBreed().getBreedName() + " " + firstDog.getName() + " is the oldest dog.\n" +
                    "She is " + firstDog.getAge() + " years old.");
        } else if (secondDog.getAge() > firstDog.getAge() && secondDog.getAge() > thirdDog.getAge()) {
            System.out.println(secondDog.getBreed().getBreedName() + " " + secondDog.getName() + " is the oldest dog.\n" +
                    "She is " + secondDog.getAge() + " years old.");
        } else if (thirdDog.getAge() > secondDog.getAge() && thirdDog.getAge() > firstDog.getAge()) {
            System.out.println(thirdDog.getBreed().getBreedName() + " " + thirdDog.getName() + " is the oldest dog.\n" +
                    "She is " + thirdDog.getAge() + " years old.");
        } else if (firstDog.getAge() == secondDog.getAge() && firstDog.getAge() != thirdDog.getAge()) {
            System.out.println(firstDog.getBreed().getBreedName() + " " + firstDog.getName() + " and " +
                    secondDog.getBreed().getBreedName().toLowerCase() + " " + secondDog.getName() +
                    " are the same age (" + firstDog.getAge() + " years old). They are older than the " +
                    thirdDog.getBreed().getBreedName().toLowerCase() + " " + thirdDog.getName() + ".");
        } else if (secondDog.getAge() == thirdDog.getAge() && secondDog.getAge() != firstDog.getAge()) {
            System.out.println(secondDog.getBreed().getBreedName() + " " + secondDog.getName() + " and " +
                    thirdDog.getBreed().getBreedName().toLowerCase() + " " + thirdDog.getName() +
                    " are the same age (" + secondDog.getAge() + " years old). They are older than the " +
                    firstDog.getBreed().getBreedName().toLowerCase() + " " + firstDog.getName() + ".");
        } else {
            System.out.println(firstDog.getBreed().getBreedName() + " " + firstDog.getName() + " and " +
                    thirdDog.getBreed().getBreedName().toLowerCase() + " " + thirdDog.getName() +
                    " are the same age (" + firstDog.getAge() + " years old). They are older than the " +
                    secondDog.getBreed().getBreedName().toLowerCase() + " " + secondDog.getName() + ".");
        }
    }
}
