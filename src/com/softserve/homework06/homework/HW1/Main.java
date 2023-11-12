package com.softserve.homework06.homework.HW1;

public class Main {
    public static void main(String[] args) {

        Bird[] birdArray = new Bird[] {
                new Eagle("black", true),
                new Swallow("gray", true),
                new Penguin("black", true),
                new Kiwi("brown", true)
        };

        for (Bird bird : birdArray) {
            System.out.println(bird.toString());
            bird.fly();
            System.out.print("\n");
        }
    }
}
