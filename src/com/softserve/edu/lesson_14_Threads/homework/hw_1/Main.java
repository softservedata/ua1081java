package com.softserve.edu.lesson_14_Threads.homework.hw_1;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new PractThread("Hello");
        Thread second = new PractThread("Big Boss");
        Thread third = new PractThread("World");

        first.start();
        second.start();
        first.join();
        second.join();
        third.start();

    }
}
