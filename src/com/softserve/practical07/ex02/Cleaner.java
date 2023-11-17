package com.softserve.practical07.ex02;

public class Cleaner extends Staff {
    final String TYPE_OF_PERSON = "Cleaner";
    protected Cleaner(String name) {
        super(name);
        System.out.printf("This is a %s created %n", TYPE_OF_PERSON.toLowerCase());
    }

    @Override
    void print() {
        System.out.printf("I am a %s named %s%n", TYPE_OF_PERSON.toLowerCase(), getName());
    }

    @Override
    void salary() {
        System.out.printf("%s's (%s) salary is below average%n", getName(), TYPE_OF_PERSON.toLowerCase());
    }
}
