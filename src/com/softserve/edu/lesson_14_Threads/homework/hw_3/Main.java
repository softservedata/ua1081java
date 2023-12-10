package com.softserve.edu.lesson_14_Threads.homework.hw_3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread thread1 = new DeadLock(lock1, lock2);
        Thread thread2 = new DeadLock(lock2,lock1);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
