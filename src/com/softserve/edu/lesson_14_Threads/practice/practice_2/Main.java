package com.softserve.edu.lesson_14_Threads.practice.practice_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread first = new PractThread("Hello world",2000);
        Thread second = new PractThread("Peace in the peace",3000);

        first.start();
        second.start();
        first.join();
        second.join();
        System.out.println("My name is Vitalik");
    }
}