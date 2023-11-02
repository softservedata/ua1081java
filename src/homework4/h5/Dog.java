package homework4.h5;

import java.util.Objects;

public class Dog {


    public enum Breed {
        BULLDOG, SPANIEL, BEAGLE, ROTTWEILER;
    }

    private String name;
    private Breed breed;
    private int age;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Moon", Breed.BULLDOG, 2);
        Dog dog2 = new Dog("Sea", Breed.BEAGLE, 1);
        Dog dog3 = new Dog("Sun", Breed.ROTTWEILER, 3);



        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            System.out.println(dog1.getName() + " it is oldest dog and has breed " + dog1.getBreed());
        } else if (dog2.getAge() > dog1.getAge() && dog2.getAge() > dog3.getAge()) {
            System.out.println(dog2.getName() + " it is oldest dog and has breed " + dog2.getBreed());
        } else {
            System.out.println(dog3.getName() + " it is oldest dog and has breed " + dog3.getBreed());
        }


                if ((dog1.getName().equals(dog2.getName())) || (dog1.getName().equals(dog3.getName())) || (dog2.getName()).equals(dog3.getName())) {
                    System.out.println("The dogs have the same name");
                } else {
                    System.out.println("All names are unique");
                }


            }
        }

