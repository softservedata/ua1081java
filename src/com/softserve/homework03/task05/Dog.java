package com.softserve.homework03.task05;
// not correct
public class Dog {
    private final String name;
    private static String BREED;// it's need to use enum instead of static field
    private final int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void setBREED(String BREED) {
        Dog.BREED = BREED;
    }

    public String getName() {
        return name;
    }

    public static String getBREED() {
        return BREED;
    }

    public int getAge() {
        return age;
    }

    public static void compareSameName(Dog dog1, Dog dog2) {
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("Two dogs with the same name");
        } else {
            System.out.println("Two dogs with the different name");
        }
    }

    public static void displayBreedOldestDog(Dog dog1, Dog dog2, Dog dog3) {
        int maxAge = dog1.getAge();
        if (maxAge < dog2.getAge()) {
            maxAge = dog2.getAge();
        }
        if (maxAge < dog3.getAge()) {
            maxAge = dog3.getAge();
        }

        if (maxAge == dog1.getAge()) {
            System.out.println("Name and the breed of the oldest dog are " + dog1.getName() + " " + dog1.getBREED());
        }
        if (maxAge == dog2.getAge()) {
            System.out.println("Name and the breed of the oldest dog are " + dog2.getName() + " " + dog2.getBREED());
        }
        if (maxAge == dog3.getAge()) {
            System.out.println("Name and the breed of the oldest dog are " + dog3.getName() + " " + dog3.getBREED());
        }
    }
}
