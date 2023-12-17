package com.softserve.homework15.ex01;

public class Main {
    public static void main(String[] args) {
        Runnable run1 = new Run1();
        Thread thread1 = new Thread(run1);

        Runnable run2 = new Run2();
        Thread thread2 = new Thread(run2);

        Runnable run3 = new Run3();
        Thread thread3 = new Thread(run3);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
    }
}
