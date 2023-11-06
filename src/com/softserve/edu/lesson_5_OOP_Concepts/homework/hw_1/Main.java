package com.softserve.edu.lesson_5_OOP_Concepts.homework.hw_1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Eagle("Black", false),
                new Swallow("Blue", true),
                new Kiwi("Green", true),
                new Penguin("White", true)
        };
        for (Bird bird : birds) {
            bird.fly();

        }


    }
}
